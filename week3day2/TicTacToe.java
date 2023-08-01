package week3day2;

import java.util.Scanner;

/*
 * - `player1Name`, `player2Name`, `player1Marker`, `player2Marker`, `emptyCell`
- `InitializeBoard()`
- `displayBoard()`
- `placeMarker(int rowIndex, int colIndex)`
- `isWinner()`
- `isDraw()`
- `isFull()`
- `play()`
- `saveGame()`
- `loadGame()`
 */

public class TicTacToe {
	
	private String player1Name;
	private String player2Name;
	private char player1Marker;
	private char player2Marker;
	private char emptyCellMarker;
	private char[][] board;
	
	public TicTacToe(String player1Name, String player2Name) {
		this.player1Name = player1Name;
		this.player2Name = player2Name;
		this.player1Marker = 'O';
		this.player2Marker = 'X';
		this.emptyCellMarker = ' ';
		this.board = new char[3][3];
	}
	
	public void intializeBoard() {
		// Assign the empty cell marker to each cell in the array.
		for (int rowIndex = 0; rowIndex < this.board.length; rowIndex++) {
			for (int colIndex = 0; colIndex < this.board[rowIndex].length; colIndex++) {
				this.board[rowIndex][colIndex] = this.emptyCellMarker;
			}
		}
	}
	
	public void displayBoard() {
		for (int rowIndex = 0; rowIndex < this.board.length; rowIndex++) {
			for (int colIndex = 0; colIndex < this.board[rowIndex].length; colIndex++) {
				System.out.print("|" + this.board[rowIndex][colIndex]);
				
				if (colIndex == this.board[rowIndex].length - 1) {
					System.out.println("|");
				}
			}
		}
	}
	
	public void placeMarker(int rowIndex, int colIndex, char marker) throws Exception {
		// Place current player's marker to the designated cell.
		// How can you determine which marker to use?
		// How can you determine if the cell is available?
		if (invalidIndex(rowIndex, colIndex) || cellOccupied(rowIndex, colIndex)) {
			throw new Exception("Cannot place marker to location: " + rowIndex + ", " + colIndex);
		}
		this.board[rowIndex][colIndex] = marker;
	}
	
	private boolean invalidIndex(int rowIndex, int colIndex) {
		return (rowIndex < 0) || (rowIndex >= 3) || (colIndex < 0) || (colIndex >= 3);
	}
	
	private boolean cellOccupied(int rowIndex, int colIndex) {
		// Assume that the indices are valid
		return (this.board[rowIndex][colIndex] != this.emptyCellMarker);
	}

	public static void main(String[] args) {
		
		TicTacToe game = new TicTacToe("Alice", "Bob");
		game.intializeBoard();
		game.displayBoard();
		
		Scanner scnr = new Scanner(System.in);
		char nextMarker = game.player1Marker;
		int rowIndex;
		int colIndex;
		while(true) {
			System.out.println("Next move:");
			rowIndex = scnr.nextInt();
			colIndex = scnr.nextInt();
			scnr.nextLine();
			try {
				game.placeMarker(rowIndex, colIndex, nextMarker);
				game.displayBoard();
				nextMarker = (nextMarker == game.player1Marker ? game.player2Marker : game.player1Marker);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}

	}

}
