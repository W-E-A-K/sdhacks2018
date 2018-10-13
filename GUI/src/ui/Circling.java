package ui;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.DebugGraphics;

@SuppressWarnings("serial")
public class Circling extends Canvas { 
	
	public Circling( int i ) { 
		setSize(1000,400); 
		if (i == 1 ) { 
			setBackground( Color.PINK );
		}
		else { 
			setBackground( Color.BLUE );
		}
		
	}
	
	@Override 
	public void paint(Graphics g) {
		System.out.println("hi");
		Graphics2D g2; 
		g2 =  (Graphics2D) g; 
		g2.drawRect(100, 100, 100, 150);
	}
	
}