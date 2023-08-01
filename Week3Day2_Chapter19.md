# Chapter 19 2D Arrays and ArrayLists

## Two-Dimensional Arrays

A **two-dimensional** array is used to contains values across multiple rows and columns. 

![](https://media.geeksforgeeks.org/wp-content/uploads/two-d.png)

**Declaration**:
```java
int[][] ary = new int[3][5];
```
- `int[][]` declares a 2D array of integers.
- `[3]` defines the number of rows.
- `[5]` defines the number of columns

**Assignment**: p19.1.1

Under the hood, a 2D array is implemented as an array of arrays. For example, `int[][] ary = new int[2][3]` allocates a 2-element array, where each array element is itself a 3-element array.

**Exercise**: Create a table of driving distances.
  |          | Boston | Chicago | Los Angeles |
  |----------|--------|---------|-------------|
  |Boston    |0       | 960     | 2960        |
  |Chicago   |960     | 0       | 2011        |
  |LA        |2960    | 2011    | 0           |
  
  A programmer can initialize a two-dimensional array's elements during declaration using nested braces, as below. 
  ```java
  int[][] numVals = {
      {22, 44, 66}, // Row 0
      {97, 98, 99}  // Row 1
};
```
Arrays of **three or more dimensions** can also be declared, as in: `int[][][] myArray = new int[2][3][5]`, which declares a total of 2*3*5 or 30 elements.

**Exercise**: Find 2D array max and min

**Exercise**: Use a 2D array in a board game.

Create the `TicTacToe` class with the following items:
- A 3-by-3 2D array representing the board.
- `player1Name`, `player2Name`, `player1Marker`, `player2Marker`, `emptyCell`
- `InitializeBoard()`
- `displayBoard()`
- `placeMarker(int rowIndex, int colIndex)`
- `isWinner()`
- `isDraw()`
- `isFull()`
- `play()`
- `saveGame()`
- `loadGame()`

## ArrayList

The array data type is invenient in the following ways:
- The size of the array must be determined up front.
- The size of the array cannot be changed afterwards.
- There lacks methods for searching, sorting, or replacing elements.

An `ArrayList` is an built-in data type that supports the above needs.

**Syntax**
```java
import java.util.ArrayList;

...
ArrayList<Integer> vals = new ArrayList<Integer>();

vals.add(31);
...
```

**Remark** `ArrayList` only support reference types. Primitive types must use there corresponding **wrapper** class as the type.

**Common ArrayList methods**: Table 19.4.1

**Iterating through an ArrayList**

```java
for (int i = 0; i < aryList.size(); i++) {
  // do something with aryList.get(i)
}
```


