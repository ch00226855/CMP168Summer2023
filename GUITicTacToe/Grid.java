
public class Grid {
	
	private char[][] boardData;
	private char player1Marker;
	private char player2Marker;
	private char emptyCellMarker;
	private char nextMarker;
	
	public Grid() {
		boardData = new char[3][3];
		player1Marker = 'O';
		player2Marker = 'X';
		emptyCellMarker = ' ';
		nextMarker = player1Marker;
		initializeBoard();
	}

	public void initializeBoard() {
		// Put empty cell marker to each cell in boardData.
		for (int row = 0; row < boardData.length; row++) {
			for (int col = 0; col < boardData[row].length; col++) {
				boardData[row][col] = emptyCellMarker;
			}
		}
	}
	
	public void placeMarker(int row, int col, char marker) {
		// WARNING: There is no validity check for the indices.
		boardData[row][col] = marker;
		
		// update the next marker.
		if (nextMarker == player1Marker) {
			nextMarker = player2Marker;
		} else {
			nextMarker = player1Marker;
		}
	}
	
	public boolean isFull() {
		for (int row = 0; row < boardData.length; row++) {
			for (int col = 0; col < boardData[row].length; col++) {
				if (boardData[row][col] == emptyCellMarker) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isWinning(char marker) {
		// check all rows
		for (int row = 0; row < boardData.length; row++) {
			if (boardData[row][0] == marker && boardData[row][1] == marker && boardData[row][2] == marker) {
				return true;
			}
		}
		
		// check all columns
		for (int col = 0; col < boardData[0].length; col++) {
			if (boardData[0][col] == marker && boardData[1][col] == marker && boardData[2][col] == marker) {
				return true;
			}
		}
		
		// check both diagonals
		if (boardData[0][0] == marker && boardData[1][1] == marker && boardData[2][2] == marker) {
			return true;
		}
		
		if (boardData[0][2] == marker && boardData[1][1] == marker && boardData[2][0] == marker) {
			return true;
		}
		
		return false;
	}
	
	public char getNextMarker() {
		return nextMarker;
	}

	public char getPlayer1Marker() {
		return player1Marker;
	}

	public char getPlayer2Marker() {
		return player2Marker;
	}
	
	
}
