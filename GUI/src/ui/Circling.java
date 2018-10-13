package ui;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.DebugGraphics;

@SuppressWarnings("serial")
public class Circling extends Canvas { 
//	DebugGraphics dg; 
	
	public Circling() { 
		//dg = new DebugGraphics(); 
		setSize(3000,1500); 
		setBackground( Color.PINK );
	}
	
	@Override 
	public void paint(Graphics g) { 
		Graphics2D g2; 
		g2 =  (Graphics2D) g; 
		g.drawRect(100, 100, 100, 150);
	}
	
}