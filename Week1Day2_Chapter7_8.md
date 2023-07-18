# Week 1 Day 2
# Review of Chapter 7 - 8

## Review of Chapter 7 User-Defined Methods

- **What is a method?**
- **Method definition**
- **Access modifiers**
    - **public**
    - **static**
- **Return type**
- **Parameters**
- **Method call**
- **Arguments**

**Exercise**: c7.1.3 Volume of a pyramid.

### Scope of Variable / Method Definitions

The name of a defined variable or method item is only visible to part of a program, known as the item's **scope**. 

- A variable declared in a method has scope limited to inside that method.
- A variable declared within a class but outside any method is called a **class member variable** or **field**. A field is visible from anywhere in the class.
- If a method's local variable (including a parameter) has the same name as a field, then in that method the name refers to the local item and the field is inaccessible.
- A method is visible to any other methods in the same class.
- Public variables and methods are visible to other classes in the program.

### Method Name Overloading
- **Method Overloading**
- **How does the machine determine which method to call?**

**Example**:
```java
public class DatePrinter {
   public static void printDate(int currDay, int currMonth, int currYear) {    
      System.out.print(currMonth + "/" + currDay + "/" + currYear);
   }

   public static void printDate(int currDay, String currMonth, int currYear) {
      System.out.print(currMonth + " " + currDay + ", " + currYear);
   }

   public static void main(String[] args) {
      
      printDate(30, 7, 2012);
      System.out.println();
      
      printDate(30, "July", 2012);
      System.out.println();
   }
}
```

**Exercise**: p7.11.1 Method name overloading

## Review of Chapter 8 Arrays

- **Array declaration**
    - by the `new` operator
    - by specifying all elements
- **Separate array declaration and array allocation**: A programmer can declare an array reference variable without allocating the array at that time and later assign the variable with an allocated array.
- **Iterating through arrays**

**Exercise**: c8.4.5 Printing array elements separated by commas

- **Array parameters**: Passing an array to a method is an example of passing a reference type variable rather than a primitive type variable

**Passing a primitive type variable to a method**
- Example: `int`, `double`, `boolean`, `char`
- A copy of the variable is passed to the method.
- Modifying the variable inside the method **does not** affect the original variable.
- The copy is removed from computer memory after the method call.

**Passing a reference type variable to a method**
- Example: `String`, `Scanner`, arrays
- A copy of the reference (address) is passed to the method. 
- Modifying the variable inside the method **does** affect the original variable.

- **Oversized arrays**
- **Add an element to an oversized array**
- **Resizing an array**