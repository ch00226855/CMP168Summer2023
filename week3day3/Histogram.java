package week3day3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Histogram extends JComponent {
	
	@Override
	public void paintComponent(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
//		g2D.setColor(Color.BLUE); // Use an existing color
		g2D.setColor(new Color(128, 128, 0)); // Represent a color using RGB coding
		g2D.fillRect(10, 10, 200, 50);
		
		g2D.setColor(new Color(0, 200, 200));
		g2D.fillRect(10, 75, 150, 50);
		
		g2D.setColor(new Color(100, 100, 100));
		g2D.fillRect(10, 140, 350, 50);
	}
	
	
	

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setSize(400, 250);
		window.setTitle("Histogram");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		Histogram canvas = new Histogram();
		window.add(canvas);
		
		window.setVisible(true);
	}

}
