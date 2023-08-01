package week3day2;

public class ConsoleTicTacToe {

	public static void main(String[] args) {
		
		char[][] board = new char[3][3];
		
		// Player 1 places a piece 'O' to the upper-left cell.
		board[0][0] = 'O';

		// Player 2 places a piece 'X' to the lower-left corner.
		board[2][0] = 'X';
		
		// Player 1 makes another move.
		board[1][1] = 'O';
		
		// Player 2 makes another move
		board[2][2] = 'X';
		
		board[2][1] = 'O';
		
		board[0][1] = 'X';
		
		// Print the board.
		// board.length represents the number of rows.
		// board[i].length represents the number of elements in row i.
		for (int rowIndex = 0; rowIndex < board.length; rowIndex++) {// loop through all rows
			for (int colIndex = 0; colIndex < board[rowIndex].length; colIndex++) {// loop through all elements in a row
				System.out.print("|" + board[rowIndex][colIndex]);
				
				if(colIndex == board[rowIndex].length - 1) {
					System.out.println("|");
				}
			}
		}
	}

}
