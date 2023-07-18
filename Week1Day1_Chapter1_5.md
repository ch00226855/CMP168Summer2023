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

- Create a project
- Create a package
- Create a class with a main method
- Use `System.out.println()` to display texts on the screen.
- Use the "Run" button to execute the program.

## Chapter 2 Review: Variables / Assignments

###Concepts:
- **Variable**: Keeps values
- **Variable declaration**: Determines the type and the identifier of the variable. Example: `int i;`
- **Variable assignment**: `i = 1;`
- **Primary variable types**: (`byte`, `int`, `short`, `long`), `char`, (`float`, `double`), `boolean`.
- **Other variable types**: `String`, `Scanner`, arrays, user-defined types. (These types store more than a single value).

**Exercise**: c2.2.4 Adding a number to a variable

**Common errors**:
- Read a variable that has not yet been assigned a value.
- Write an assignment statement in reverse, such as `numKids + numAdults = numPeople` or `9 = beansCount`.

### Input / Output Basics

- How to print something to the screen: `System.out.print`, `System.out.println` (print with a new line)
- How to read something from user: `java.util.Scanner`
- Useful scanner methods: `nextInt()`, `nextLine()`, `next()`

Be mindful that there is an invisible new line symbol at the end of each line. Sometimes we need to use the `nextLine()` method to exhaust it.
**Example:**

```java
Scanner keyboard = new Scanner(System.in);

System.out.println("Enter something:");

int num1 = keyboard.nextInt();
String str1 = keyboard.nextLine();
String str2 = keyboard.next();
String str3 = keyboard.nextLine();

System.out.println("num1: " + num1);
System.out.println("str1: " + str1);
System.out.println("str2: " + str2);
System.out.println("str3: " + str3);
```
Input:
```
100
Hello
```

Expected output:
```
num1: 100
str1: 
str2: Hello
str3: 
```

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
- Format floating-point numbers: `System.out.printf("%.2f", myFloat); ` (**Review Section 3.2 for more details)
**Watch p2.7.5 Reducing the output of pi**.
- Scientific notation: `7.2e-4`
Sometimes we get an scientific notation instead of 0:
```
System.out.println(1 - 1.0 / 5777 * 5777);
```
The output is `1.1e-16`, which is actually very close to the precise answer 0.0.

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

Example:

```java
double y = 1.0 / 3.0;
System.out.println("Before casting: " + y);
System.out.println("After casting to int: " + (int)y);
```

**Exercise**: c2.12.2 Computing average kids per family.



### Strings
A **string** is a sequence of characters.
- A string literal surrounds a character sequence with double quotes, as in `"Hello"` or `"52 Main St"`.
- **Store a string**: `String str = "Hello";`
- **Read a string from user input**: `Scanner.next()`, `Scanner.nextLine()`.

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
- **if**: executes the code if the condition is true
- **if-else**: executes the if block if the condition is true, otherwise it executes the else.
- **if-(else if)-else**: creates multiple branches

### Equality and Inequality Operators
- Equality: `a==7`
- Inequality: `a!=7`
- Relational operators: `>, <, >=, <=`.
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

