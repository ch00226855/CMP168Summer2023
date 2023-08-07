import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToeFrame extends JFrame implements ActionListener {
	
	private JButton[][] board;
	private Grid grid;
	
	public TicTacToeFrame() {
		
		grid = new Grid();
		
		board = new JButton[3][3];
		
		// Go through the array and initialize each button.
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				
				board[row][col] = new JButton(" ");
				board[row][col].setFont(new Font("Serif", Font.PLAIN, 30));
				board[row][col].addActionListener(this);
			}
		}
		
		// Set layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = null;
		
		// Add each JButton to the frame.
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				constraints = new GridBagConstraints(); // Recreate the constraints
				constraints.gridx = col;
				constraints.gridy = row;
				constraints.ipadx = 150;
				constraints.ipady = 150;
				this.add(board[row][col], constraints);
			}
		}		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Find out the row index and column index of the button being clicked.
		int rowIndex = -1;
		int colIndex = -1;
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (e.getSource().equals(board[row][col])) {
					rowIndex = row;
					colIndex = col;
					System.out.println("Index of button being clicked: " + rowIndex + " " + colIndex);
				}
			}
		}
		
		
		// Place a marker on that cell. Update the grid data.
		board[rowIndex][colIndex].setText("" + grid.getNextMarker());
		grid.placeMarker(rowIndex, colIndex, grid.getNextMarker());
		
		// Check the game status:
		// 1. If someone is winning, display a dialog box for another game.
		// 2. If the games ends with a draw, display a dialog box for another game.
		// 3. If the game should continue, do nothing.
		if (grid.isWinning(grid.getPlayer1Marker())) {
			JOptionPane.showMessageDialog(this, "Player 1 wins!");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		TicTacToeFrame window = new TicTacToeFrame();
		
		window.setTitle("Tic Tac Toe");
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
