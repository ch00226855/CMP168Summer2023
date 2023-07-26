# Week 2 Day 2
# Chapter 16 Exceptions

## The Comparable Interface
It is a common programming task to sort elements of an array or other data collections. In order for the built-in `sort()` method to work, objects created from a user-defined class must implement the `Comparible` interface, which declares the `compareTo()` method. Here we study how to implement `Comparible`, and in Chapter 19 we will see how a Java *arrayList* can sort comparible objects.

**Syntax**:
```java
public class ClassName implements Comparable<Type> {
   ...
   @Override
   public int compareTo(Type obj) {
   
      if (...) {// Return a NEGATIVE value if "this" object should be placed BEFORE "obj" (like 3 is place before 4)
         return -1;
      } else if (...) {// Return a POSITIVE value if "this" object should be placed AFTER "obj" (like 4 is place after 3)
         return 1;
      } else {// Return 0 if these two objects are considered the same.
         return 0;
      }
   }
}
```

## Chapter 16 Exceptions

## Handling Exceptions
**Error-checking code** is code a programmer writes to detect and handle errors that occur during program execution. An exception is a circumstance that a program was not designed to handle, such as if the user enters a negative height.

- p16.1.1: An unhandled exception can end program execution.
- p16.1.2: Catching excdeptions with try and catch blocks

**Exception-handing constructs**
```java
...
try {
   ...   
   // If error detected
      throw objectOfExceptionType;
   ...
}
catch (exceptionType excptObj) {
   // Handle exception, e.g., print message
}
...
```
- A `try` block surrounds normal code. It contains one or more `throw` statements.
- If a `throw` statement is reached, execution jumps immediately to the end of the try block.
- A `catch` clause immediately follows a `try` block to handle exceptions.
- There can be multiple `catch` blocks to handle different exceptions.

## Errors and Exceptions

Java offers several built-in `Throwable` types like `Error` and `Exception` to represent various unexpected incidents that stop the normal execution of a program:

![](https://media.geeksforgeeks.org/wp-content/uploads/Exception-in-java1.png)

- An `Exception` object is throwed when an event (such as `IndexOutOfBoundsException`) occurs that disrupts the normal flow of instructions.
- The `Exception` class has a constructor that can take in a string, as in `throw new Exception("Invalid weight.");`
- An `Exception` object can return the string using the `getMessage()` method.
- An `Exception` object has a `printStackTrace()` method to indicate the location of the exception.
- `Error` objects are more severe and should be avoided. Example: `OutOfMemoryError`, `StackOverflowError`.

**Why use `Exceptions`?**
- Separate exception handling code from ordinary code.
- Provide flexibility on how exceptions can be handled.
- Group and differentiate exceptions based on their types.

**Example**: c16.1.2 Handling exceptions.

**Common exception types**: Table 16.1.1

## Throwing Exceptions

A program can throw user-defined exceptions using a throw statement.

**Example:** `throw new Exception("Invalid date.");`

p16.2.1: Throwing exceptions with the throw statement

### Multiple Catch Blocks

Different throws in a try block may throw different exception types. Multiple handlers may exist, each handling a different type. The first matching handler executes; remaining handlers are skipped.

**Syntax**:
```java
try {
   ...
   throw objOfExcptType1;
   ...
   throw objOfExcptType2;
   ...
   throw objOfExcptType3;
   ...
}
catch (ExcptType1 excptObj) {
   // Handle type1
}
catch (ExcptType2 excptObj) {
   // Handle type2
}
catch (Throwable thrwObj) {
   // Handle others (e.g., type3)
}
```

A common error is to place a catch block intended to handle exceptions of a base class before catch blocks intended to handle exceptions of a derived class, resulting in a compiler error with a message such as: "exception has already been caught".

p16.2.4: Multiple exception handlers

## Exception with Methods

If a method throws an exception, it can choose to handle it itself; alternatively, it can throw it outside so that the exception can be handled depending on where the method is called.

**Example**: BMI example using exception-handling constructs along with methods.
- If a method adds `throw Exception` on the first line of its definition, it doesn't need to handle the exception within the method.
- The method that calls an exception-throwing method may handle the exception or throw it even further.
- A common error is forgetting to enclose code that may throw exceptions with try-catch constructs. It will result in a compiler error.

**Unchecked Exceptions**: Table 16.3.1 These exceptions do not require programmers to handle specifically. They should be avoided from the program.

## User-Defined Exceptions

The programmer may want to create a new exception type. A new exception type must be created by extending the `Exception` class.

p16.4.3: User-defined exception class with a fixed exception message.


### The `finally` Block

The `finally` block can be provided after the last `catch` block. It will always be executed.

```java
try {
   // risky code
} catch (Exception e) {
   // handle the exception
} finally {
   // clean up code such as closing data streams, free memory spaces
}
```
- The finally block always executes regardless of an exception being thrown or not.
- It is used to make sure the program still does some essential operations even if something unexpected happens.
