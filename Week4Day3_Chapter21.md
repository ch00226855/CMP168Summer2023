# Week 4 Day 3
# Chapter 21 Recursion

## Memory Regions: Heap / Stack

A program's memory usage typically includes four different regions:
- **Code**: The region where the program instructions are stored.
- **Static memory**: The region where static fields are allocated. 
  - The static fields are alocated once and last for the duration of a program's execution.
  - Their memory addresses do not change during the execution.
- **The memory stack**: The region where a method's local variables are allocated during a method call.
  - A method call adds local variables to the stack
  - Local variables include primitive type variables (storing the values) and reference type variables (storing the references)
  - When the method call finishes, a value is returned (if the return type is not void), and other local variables are removed.
  - The memory is allocated automatically for these variables.
- **The memory heap**: The region where the **new** operator allocates memory for objects.

<img src="https://github.com/ch00226855/CMP168Summer2021/raw/main/images/chp15_01_stackheap.png" width="600">

Figure 21.1.1: Use of the four memory regions.

## Methods Containing Calls to Other Methods
A method can contain calls to other methods to make the code more modular.
- When a method call is reached, the initiating method will be blocked from proceeding until the called method complete.
- The memory stack will allocate new space to support the new method call.
- When the called method completes, local variables will be removed. The returned value will be returned to the initiating method.
- If the called method calls another method, it will be pause and the third method will be executed first, as so on.

## Garbage Collection
Because the amount of memory available to a program is finite, objects allocated to the heap must eventually be removed when they are no longer needed. Java uses a mechanism called **garbage collection** to automatically free memory locations in order to enable momery reuse.
- The Java virtual machine keeps a **reference count** for the number of reference variables of every object. 
- If the reference count becomes zero, the object is considered an **unreachable object**, and will be removed when the Java virtual machine invokes the garbage collector.