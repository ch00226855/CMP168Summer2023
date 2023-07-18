# Week 1 Day 2
# Review of Chapter 7 - 8

## Review of Chapter 7 User-Defined Methods

- **What is a method?**: a group of statements with a name
    - identifier (name)
    - a list of parameters (determines the behavior of the method)
    - content (a block of code)
    - return statement (optional)
- **Method definition**: 
```java
public static void method1(int x, int y) {
    
\\code block

}
```
- **Access modifiers**
    - **public**: Any part of the program can access this method. (`private`, `protected`, none)
    - **static**: A static method is associate with the class. It only uses values that are passed to this method
- **Return type**: The type of the returned value. If no value is returned, then use `void`
- **Parameters**: The variables that will be used during the execution of the method.
- **Method call**
```java
method1(1, 2);
```
- **Arguments**: The values that are passed to the parameters of a method.

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

    // We cannot define another printDate method like the following:
   public static void printDate(int year, int month, int day) {} 

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
    ```java
    int[] grades = new int[30];
    ```
    - by specifying all elements
    ```java
    int[] grades = {50, 60, 70, 80, 90};
    ```
- **Separate array declaration and array allocation**: A programmer can declare an array reference variable without allocating the array at that time and later assign the variable with an allocated array.
```java
int[] grades;
grades = new int[30];
//or
grades = {50, 60, 70, 80, 90};
```

- **Iterating through arrays**
```java
//Print all grades to the screen.
for (int i = 0; i < grades.length; i++) {
    // do something with grades[i]
    
}
```
```java
// Print all grades in reverse order.
for (int i = grades.length - 1; i >= 0; i--) {
    System.out.println(grades[i]);
}
```

**Exercise**: c8.4.2 Printing array elements separated by commas

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

### Oversized Arrays
- **Oversized arrays**: Allocate more than enough space for the array, so that we can add elements in the future.
- **Add an element to an oversized array**
```java
// String[] students = {"Alex", "Bob", "Charlene"};
String[] students = new String[10];
int numStudents = 3; // We need a separate variable to store the actual length
students[0] = "Alex";
students[1] = "Bob";
students[2] = "Charlene";

// Suppose that we have a new student David.
students[3] = "David";
numStudents++;

// Print all student names
for (int i = 0; i < numStudents; i++) {
    System.out.println(students[i]);
}
```
- **Resizing an array**: When an oversized array is full, we need to replace it with an even larger array.
```java
// Suppose that we filled the students array.
students[4] = "Eva";
students[5] = "Fred";
students[6] = "Gil";
students[7] = "Henry";
students[8] = "Ivan";
students[9] = "Jacob";
numStudents = 10;

// Suppose yet another student "Kevin" joins.
String[] newArray = String[20];
for (int i = 0; i < numStudents; i++) {
    newArray[i] = students[i]; // Assign all existing students to the new array.
}

newArray[numStudents] = "Kevin";
numStudents++;
students = newArray; // replace the students array with the new array.

// What is the length of students at this point? Answer: 20.
// What is the value of numStudents? Answer: 11.
```