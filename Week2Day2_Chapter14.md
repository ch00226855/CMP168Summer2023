# Week 2 Day 2
# Chapter 14 Abstract Class and Interfaces (Continued)

## Review: Abstract Classes

**Abstract classes** allow us to define a "super class" that describes key trais for multiple subclasses.

- Syntax:
```java
abstract class AAA {

    abstract void bbb() {};

}
```
- We cannot instantiate objects directly from abstract classes.
- If a class extends an abstract class, it must implement all abstract methods of the abstract class.
- An abstract class can be used as an array type.

**Example:** Java classes for GUI (Graphical User Interface)

![](https://www3.ntu.edu.sg/home/ehchua/programming/java/images/AWT_ContainerComponent.png)

## Interfaces

Java does not allow *multiple inheritance* to avoid inheriting a variable or method from two parent classes, where the method was defined differently. 

**Example:** Multiple inheritance is forbidden in Java

![](https://github.com/ch00226855/CMP168Summer2023/raw/main/img/Week2Day2_MultipleInheritance.png)

Instead, Java provides **interfaces** as another mechanism for programmers to state that a class adheres to rules defined by the interface.

- An interface can specify a set of abstract methods that do not have a method body.
- An implementing class must list the interface name after the keyword **implements**.
- A class can implement multiple interfaces using a comma separated list.
- An implementing class must override and implement all the abstract methods from the interfaces.

**Exercise**: p14.4.1 Comparison of interfaces and abstract classes

- UML Diagrams denote interfaces using the keyword interface, inside double angle brackets, above the class name.
- Classes that implement the interface have a dashed line with an unfilled arrow pointing at the interface.

**Exercise**: p14.4.2: UML interfaces

An interface may contain:

- constants
- method signatures
- default methods
- static methods
- inner classes

**Example:** Pets that can eat and speak
![](https://github.com/ch00226855/CMP168Summer2021/raw/main/images/chp10_Interface.png)

1. What happens if the abstract methods are not implemented?
2. Call `eat()` and `speak()` methods from a dog and a cat.
3. In the main method of `Tester` class, feed the same food to an array of pets, observe that cats and dogs metabolise differently.
4. Create another class that is not a pet, but can also eat and speak. 
5. Create an array of `FoodEater` and call the `toString()` method of all the elements.
