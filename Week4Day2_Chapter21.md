# Week 4 Day 2
# Chapter 21 Recursion 

## Recursive Methods
A methods that calls itself is a **recursive method**

**Example**:
```java
public static void countDown(int countInt) {
      if (countInt <= 0) {
         System.out.println("Go!");
      }
      else {
         System.out.println(countInt);
         countDown(countInt - 1);
      }
   }
```

**What will happen if the `main` method calls `countDown(2)`?**

**Exercise**: 21.5.2 Thinking about recursion

**Exercise**: Write a method that prints the alphabet backwards from a given starting letter. (c21.5.1)

## Write a Recursive Method
- Define at least one **base case**. Base cases are the termial points of the recursion.
- Include a **recursive** call in the method definition.
- Check the logic: Will every possible recurve reach a base case eventually? There will be an `StackOverFlowException` otherwise.

**Recursive methods vs. loops**:
- A recursive method creates a sequence of method calls, while a loop locates in a single method call.
- A recursive method will continue the recursion until a base case is reached. A loop will continue until the condition becomes false.
- A recursive method is cleaner to define, but usually takes more memory space to execute.
- Both approaches risk of infinite execution.

**Example**: The **factorial** n! is the product of all positive integers up to n. Ex: 5! = 5 * 4 * 3 * 2 * 1 = 120. Write a recursive method that returns the facotrial of a given number

**Example**: The **Fibonacci numbers** is a sequence of integers where each number is the sum of two preceeding ones. The sequence starts as 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

<img src="https://clevelanddesign.com/wp-content/uploads/2020/09/the-golden-ratio-teaser.jpg" width="600">

Write a method `fib(int n)` that returns the n-th Fibonacci number. Ex: `fib(0)` returns 0, `fib(6)` returns 8.

## Search Algorithms
Consider writing a method that searches for the index of a given number from a array.
- Write the search method with a loop
- Write the search method with recursion
- Performance analysis: If there are n numbers in the array,
  - What is the minimum number of comparisons needed to find the index? The answer is called the **best-case complexity**.
  - What is the maximum number of comparisons needed to find the index? The answer is called the **worst-case complexity**.
  - What is the average number of comparisons needed to find the index? The answer is called the **average-case complexity**.

Now consider that the array is sorted. Can we do better?

**The Guessing Game**:
Consider a guessing game program where a friend thinks of a number from 0 to 1000 and you try to guess the number, with the friend telling you to guess higher or lower until you guess correctly. How can we guess the number effectively?

- Incremental guessing: guess 0, 1, 2, 3, ...
- Binary guessing: guess the average

Approach 2 requires only 10 guess to guarantee a find because it narrows down the range by half every time. There is a similar **binary search** algorithm for searching in a sorted array. (p21.6.1 Binary search)

**Implement the Binary Guessing Algorithm**:
A recursive method is a natural match for the recursive binary search algorithm. 
- A method `guessNumber(lowVal, highVal, scnr)` has parameters that indicate the low and high sides of the guessing range and a Scanner object for getting user input.
- The method guesses at the midpoint of the range. 
- If the user says lower, the method calls `guessNumber(lowVal, midVal, scnr)`. 
- If the user says higher, the method calls `guessNumber(midVal + 1, highVal, scnr)`.
- **What is the base case?**

**Exercise**: Implement the binary search algorithm for numbers / strings.

**Performance Analysis of Binary Search**
Suppose the length of the array is n.
- What is its best-case complexity? 
- What is its worst-case complexity? 
- What is its average-case complexity? 

## O Notation
- The **Big O** notation is a mathematical way of describing how a function (running time of an algorithm) generally behaves in relation to the input size. 
- In Big O notation, all functions that have the same growth rate (as determined by the highest order term of the function) are characterized using the same Big O notation. - - All functions that have the same growth rate are considered equivalent in Big O notation.

p21.12.1: Determining big O notation of a function.

Table 21.12.1: Growth rates for different input sizes.

Figure 21.12.2: Runtime complexities for various examples.

<img src="https://miro.medium.com/v2/resize:fit:1400/1*5ZLci3SuR0zM_QlZOADv8Q.jpeg" width="600">

## Sorting
Sorting is the process of converting a list of elements into ascending (or descending) order. The challenge of sorting is that when the list is long, a program can't "see" the entire list to know where to move an element.

**Selection Sort**: Sort the numbers by swapping the first number with the smallest number.

**Merge Sort**: Sort both halves of the list, adn then merges the sorted halves to produce a sorted list. (p21.15.1)
