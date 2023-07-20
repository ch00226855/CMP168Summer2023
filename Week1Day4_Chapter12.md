# Week 1 Day 4
# Chapter 12 Inheritance

### Derived Classes

A **derived class** (or subclass) is a class that is derived from another class. The class it is deriving from is called a **base class** (or superclass).

![](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/02/inheritance-in-java.jpg)

The keyword `extends` is used to establish inheritance through the parent-child relationship. 

**Example:** Business class and Restaurant class

- Define a `Business` class with:
  - \- name: String
  - \- address: String
  - \+ setName(String): void
  - \+ setAddress(String): void
  - \+ getDescription(): String
- Define a `Restaurant` class:
  - **Extends** the `Business` class (In UML, inheritance is expressed by an arrow pointing to the base class)
  - \- rating: int
  - \+ setRating(int): void
  - \+ getRating(): int

**Use case:** 
- p12.1.7: Inheritance example
- c12.1.2: Basic inheritance

- The members of a derived class have access to the *public* members of the base class, but not to the *private* members of the base class. 
- The access modifier **protected** provides access to derived classes and all classes in the same package but not by anyone else. 
- In any constructor of the extended class, it is recommended to call a constructor from the parent class first using the keyword `super`.

### Overriding

When a derived class defines a member method that has the same name and parameters as a base class's method, the member method is said to **override** the base class's method. The `@Override` **annotation** is placed above a method that overrides a base class method so the compiler verifies that an identical base class method exists.

**Example**: Override the `getDescription()` method in `Restaurant` so that it also includes the restaurant rating.

An overriding method can call the overridden method by using the super keyword. Ex: `super.getDescription()`. The super keyword is a reference variable used to call the parent class's methods or constructors.

**Example**: Use expression `super.getDescription()` in the overriden method.

**Exercise**: p12.3.3: Override example, c12.3.2: Basic derived class member override

### The `Object` Class
The `Object` class is the base class for all other classes. It allows every class to have some basic functionality, including:
- `toString`: returns the object's class and hexadecimal address in memory
- `equals()`: determines if two variable refer to the same object.

Programmers can *override* these methods so that it can perform its task differently.

- Override the `toString()` method of `Restaurant` so that the string contains the name and rating in a nice format.
- Override the `equals()` method of `Restaurant` so that two Restaurant objects are the same as long as they have the same name.

**Example**: 
- Override the `toString()` method of `Business` so that it returns a string containing its name and address.
- Override the `toString()` method of `Restaurant` so that it returns a string containing its name, address, and rating.
- Override the `equals()` method of `Business` so that it returns `true` if the object in comparison:
  - is also a `Business` object
  - has the same name
  - has the same address


### Polymorphism

**Polymorphism** refers to determining which program behavior to execute depending on data types. 

**Example**: A array of generic items.
- Create two `Business` objects and a `Restaurant` object.
- Create an array to include all three objects. What is the data type of this array?
- Write a for loop to print description of all three objects. Which `getDescription()` method is used for the Restaurant object?

**Exercise**: c12.5.1: Polynophism and method overloading

### Nested Classes

The Java programming language allows you to define a class within another class. Such a class is called a **nested class**. It can be either static or non-static.

**Syntax**:
```java
class OuterClass {
    ...
    static class StaticNestedClass {
        ...
    }
    class InnerClass {
        ...
    }
}
```

**Using nested classes**
```java
OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
OuterClass.InnerClass innerObject = outerObject.new InnerClass();
```

**Why Use Nested Classes?**

- It is a way of logically grouping classes that are only used in one place.
- It increases encapsulation.
- It can lead to more readable and maintainable code.
