package week3day3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class PacLady extends JComponent {

	@Override
	public void paintComponent(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		// Draw a large pink disk to represent the face
		g2D.setColor(Color.PINK);
		g2D.fillOval(5, 5, 350, 350);
		
		// Draw a small purple disk to represent her eye
		g2D.setColor(new Color(235, 52, 180)); // Google "color picker" to find the numbers
		g2D.fillOval(180, 70, 50, 50);
		
		// Draw an arc to show the mouth
		g2D.setColor(getBackground());
		g2D.fillArc(5, 5, 350, 350, -30, 60);
		
	}
	
	
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		
		window.setSize(380, 400);
		window.setTitle("Pac Lady");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		PacLady pc = new PacLady();
		window.add(pc);
		
		window.setVisible(true);
		
	}

}
