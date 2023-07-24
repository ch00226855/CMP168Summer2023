# Week 2 Day 1
# Chapter 14 Abstract Class and Interfaces

**Motivating Problem:** Suppose you lead a team of 5 programmers. Your team's task is to create all types of vehicles in a virtual reality software. Here are your expectations to your teammates:
- Junior programmer A: Create a `Car` class. A car should be able to accelerate, brake, and honk.
- Junior programmer B: Create a `Boat` class. A boat should be able to accelerate, brake, and honk.
- Junior programmer C: Create a `Motercycle` class. A motercycle should be able to accelerate, brake, and honk.

**How can you make sure that they meet your expectations?**

### Abstract Classes

An **abstract class** is a class that guides the design of subclasses but cannot itself be instantiated as an object. 

**Ex:** An abstract `Shape` class might also specify that any subclass must define a `computeArea()` method. (p14.1.1, p14.1.2)

- An **abstract method** is a method that is not implemented in the base class, thus all derived classes must override the function.
- An abstract method is denoted by the keyword `abstract` in front of the method signature. Ex: `abstract double computeArea();`
- A **concrete class** is a class that is not abstract, and hence can be instantiated.

**Why do we need abstract classes?**
- Force its subclasses to implement certain behavior.
- Allow methods to use abstract parameters.

### Syntax

![](https://i.stack.imgur.com/GDPOs.png)

**Exercises:**
- p14.2.1 - 3: Working with abstract classes.
- p14.3.3 - 4: UML for abstract classes.

**Example**: Pets
![](https://github.com/ch00226855/CMP168Summer2021/raw/main/images/chp10_AbstractClass.png)

In the `main` method of `Tester` class, do the following:

1. Create 2 instances of the Dog using the overloaded constructor
2. Create 2 instances of the Cat using the overloaded constructor
3. Try to create an instance of a Pet to see that it CANNOT be instantiated. Comment it out and move on to the next step
4. Create an array of type Pet and populate it with references to all the Dog and Cat instances created earlier
5. Iterate through the array and print the content of each element by using the toString() method
6. Call the play method on each element to ensure it performs the appropriate behavior

**Challenges:**
1. Modify `Pet`, `Dog` and `Cat` class so that there are counters on how many pets, dogs and cats created.
2. Define a method `letPetsPlay(Pet[])` that calls the `play()` method of all pets in the array.




