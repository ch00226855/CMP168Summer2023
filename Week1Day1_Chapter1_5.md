# Week 1 Day 1
# Course Introduction and Review of Chapter 1 - 5

## Course Introduction
- Blackboard
- Github
- Dropbox
- Syllabus
- Textbook
- Eclipse IDE

## Chapter 1 Review: Introduction to Java
**Review Exercise**: Create a "Hello World" program with Eclipse.

## Chapter 2 Review: Variables / Assignments

###Concepts:
- **Variable**
- **Variable declaration**
- **Variable assignment**
- **Primary variable types**

**Exercise**: c2.2.4 Adding a number to a variable

**Solution**: 

**Common errors**:
- Read a variable that has not yet been assigned a value.
- Write an assignment statement in reverse, such as `numKids + numAdults = numPeople` or `9 = beansCount`.

### Input / Output Basics

- How to print something to the screen?
- How to read something from user?


### Identifiers
A name created by a programmer for an item like a variable or method is called an **identifier**. An identifier must
1. be a sequence of letters (a-z, A-Z), underscore (\_), dollar sign ($), and digits (0-9);
2. not start with a digit;
3. not be a **reserved word** such as `int` or `public`.

**Invalid identifers:** `2ndGrade`, `my name`, `Great!`, `static`.

- Identifiers are case sensitive.
- Java's naming convention for variables is **camel casing**, like `numApples` or `peopleOnBus`.
- A good practice is to create meaning ful identifier names that descirbes the variable's purpose.

**Exercise**: p2.3.2 Valid Identifiers

### Arithmetic Expressions
- `+, -, *, /`
- `()`
- **Modulo operator `%`**: 
  - checking divisibility: `x % 4` checks if x is divisible by 4.
  - even/odd: `x % 2` returns 1 if x is odd, returns 0 if x is even.
- **Compound operators `+=, -=, *=, /=`**
- **Increment operator `i++` and decrement operator `i--`**
- `int` vs. `double`
- Division by zero
- Format floating-point numbers: `System.out.printf("%.2f", myFloat); ` **Watch p2.7.5 Reducing the output of pi**.
- Scientific notation: `7.2e-4`
- Final variables: variables whose values cannot change after initialization.

**Exercise**: c2.7.1 Sphere volume.

### Math Methods
- A **method** is a list of statements executed by invoking the method's name. Such action is known as a **method call**. 
- Useful math methods: `Math.sqrt()`, `Math.pow()`, `Math.abs()`, `Math.random()`.
- Input values (called **arguments**) appear within `()`. 
**Exercise**: 2.10.3 Distance between two points.

### Type Conversions

A **type conversion** is a conversion of one data type to another, such as an int to double.

- **Implicit Conversion**
- **Type Casting**

**Exercise**: c2.12.2 Computing average kids per family.



### Strings
A **string** is a sequence of characters.
- A string literal surrounds a character sequence with double quotes, as in `"Hello"` or `"52 Main St"`.
- **Store a string**
- **Read a string from using input**

**Exercise**: c2.15.2 Reading and outputting strings.

## Chapter 3 Input / Output

### Output Formatting
A programmer can adjust the way the output appears, known as **output formatting**. This can be done with `System.out.printf()` or `String.format()`.

Example:
```java
String account = "Prime";
double total = 210.35;
int years = 5;

System.out.printf("The %s account saved you $%f over %d years\n",
    account, total, years);
```

- The first argument is a **format string** that contains serveral **format specifiers**.
- A format specifier specifies the type of value to print in its place. It begins with `%`.
  - `%d`: integer
  - `%f`: floating-point number
  - `%s`: string
- Read Table 3.2.2 Floating-point formatting, Table 3.2.3 Integer formatting, Table 3.2.4 String formatting

**Exercise**: c3.2.2 Printing a maximum number of decimals.

**Solution:** `System.out.printf("%.2f\n", outsideTemperature);`

## Chapter 4 Decision Branches
A **branch** is a sequence of statements only executed under a certain condition.
- **if**
- **if-else**
- **if-else if-else**

### Equality and Inequality Operators
- Equality: 
- Inequality: 
- Relational operators: 
- Floating-point types should **not** be compared using `==` due to their imprecise presentations.
- String types should **not** be compared using `==`. Instead, use its `equals()` and `compareTo()` methods.

### Logical Operators
- And: 
- Or: 
- Not: 

**Example**: p4.5.1 Logical operators

**Exercise**: c4.5.1 Detect number range.

## Chapter 5 Loops
A **loop** is a program structure that repeated executes the loop's statement (**loop body**) while the loop's expression is true.

**Example**: p5.1.4 Computing an average

- **The while loop**
- **The for loop**
- **The do-while loop**

**Example**: p5.2.1 While loop.

**Example**: p5.4.1 For loop.



### Break and Continue

- **break statement** 
- **continue statement** 

