package week3day2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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
	
	public boolean isWinner(char marker) {
		
		// How can a player win the game? Use this.board array
		
		// 1. Check every row.
		// How can we check if the first row is filled with marker?
		// this.board[0][0] == marker && this.board[0][1] == marker && this.board[0][2] == marker
//		for (int row = 0; row < this.board.length; row++) {
//			if (this.board[row][0] == marker && this.board[row][1] == marker && this.board[row][2] == marker) {
//				return true;
//			}
//		}
		
		// The following loop is easier to generalize to larger boards.
		for (int row = 0; row < this.board.length; row++) {
			boolean condition = true;
			for (int col = 0; col < this.board[row].length; col++) {
				condition = condition && (this.board[row][col] == marker);
			}
			if (condition) {
				return true;
			}
		}
		
		// 2. Check every column.
		for (int col = 0; col < this.board[0].length; col++) {
			if (this.board[0][col] == marker && this.board[1][col] == marker && this.board[2][col] == marker) {
				return true;
			}
		}
		
		// 3. Check the main diagonal (\) and the skewed diagonal (/).
//		if (this.board[0][0] == marker && this.board[1][1] == marker && this.board[2][2] == marker) {
//			return true;
//		}
		
//		if (this.board[0][2] == marker && this.board[1][1] == marker && this.board[2][0] == marker) {
//			return true;
//		}
		
		// Generate the condition for the main diagonal with a loop.
		boolean condition = true;
		for (int i = 0; i < this.board.length; i++) {
			condition = condition && (this.board[i][i] == marker);
		}
		
		if (condition) {
			return true;
		}
		
		condition = true;
		
		for (int i = 0; i < this.board.length; i++) {
			condition = condition && (this.board[i][2-i] == marker);
		}
		
		if (condition) {
			return true;
		}
		
		// If none of the above happens
		return false;
		
	}
	
	public boolean isFull() {
		// check every element (on every row) is NOT the emptyCellMarker.
		boolean isFull = true;
		for (int row = 0; row < this.board.length ; row++) {
			for (int col = 0; col < this.board[row].length; col++) {
				// check this.board[row][col]
				if (this.board[row][col] == this.emptyCellMarker) {
//					return false;
					isFull = false;
				}
			}
		}
//		return true;
		return isFull;
	}
	
	public void saveGame() {
		// write the content of this.board to a file named "GameStatus.txt".
		
		// create a FileOutputStream object and a PrintWriter object
		FileOutputStream file = null;
		PrintWriter pw = null;
		
		// Write the content of the board array to the file
		try {
			file = new FileOutputStream("GameStatus.txt");
			pw = new PrintWriter(file);
			
			// Write each marker to a separate line.
			for (int row = 0; row < this.board.length; row++) {
				for (int col = 0; col < this.board[row].length; col++) {
					pw.println(this.board[row][col]);
				}
			}
			
			System.out.println("Game saved.");
		} 
		// Handle the IOException
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		// close the file object
		finally {
			try {
				pw.close(); // close PrintWriter before closing the file!
				file.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println("Game not saved.");
			}
		}
	}
	
	public void loadGame() {
		// read file "GameStatus.txt" and assign values to this.board.
		
		// Create a Scanner object and a FileInputStream object
		FileInputStream file = null;
		Scanner sc = null;
		char marker;
		// Read markers from file, assign them to this.board
		try {
			file = new FileInputStream("GameStatus.txt");
			sc = new Scanner(file);
			
			for (int row = 0; row < this.board.length; row++) {
				for (int col = 0; col < this.board[row].length; col++) {
					marker = sc.nextLine().charAt(0);
					this.board[row][col] = marker;
				}
			}
			
			System.out.println("Game loaded.");
		} catch (IOException e) {
			System.out.println("No saved game found!");
		} finally {
			try {
				file.close();
				sc.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public static void main(String[] args) {
		
		TicTacToe game = new TicTacToe("Alice", "Bob");
		game.intializeBoard();
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Do you want to continue from saved game? (Y/N)");
		char loadGame = scnr.nextLine().charAt(0);
		if (loadGame == 'Y') {
			game.loadGame();
		}
		
		game.displayBoard();
		
		char nextMarker = game.player1Marker;
		int rowIndex;
		int colIndex;
		boolean continuePlaying = true;
		while(continuePlaying) {
			System.out.println("Next move (Enter \"-1 -1\" to save the game):");
			rowIndex = scnr.nextInt();
			colIndex = scnr.nextInt();
			scnr.nextLine();
			
			if (rowIndex == -1 && colIndex == -1) {
				game.saveGame();
				continuePlaying = false;
				continue; // skip the rest of the current iteration
			}
			
			try {
				game.placeMarker(rowIndex, colIndex, nextMarker);
				game.displayBoard();
				nextMarker = (nextMarker == game.player1Marker ? game.player2Marker : game.player1Marker);
				if (game.isWinner(game.player1Marker)) {
					System.out.println(game.player1Name + " wins the game!");
					continuePlaying = false;
				} else if (game.isWinner(game.player2Marker)) {
					System.out.println(game.player2Name + " wins the game!");
					continuePlaying = false;
				} else if (game.isFull()) {
					System.out.println("The game ends with a draw.");
					continuePlaying = false;
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}

	}

}
