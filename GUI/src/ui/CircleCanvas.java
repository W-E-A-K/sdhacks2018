package ui;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

@SuppressWarnings("serial")
public class CircleCanvas extends Canvas { 
	
	public CircleCanvas() { 
		setSize(1000,400); 
		setBackground( Color.PINK );
		
	}
	
	@Override 
	public void paint(Graphics g) {
		System.out.println("hi");
		Graphics2D g2; 
		g2 =  (Graphics2D) g; 
		g2.drawRect(100, 100, 100, 150);
	}
	
}