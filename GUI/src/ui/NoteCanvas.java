package ui;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.DebugGraphics;

@SuppressWarnings("serial")
public class NoteCanvas extends Canvas { 
	
	public NoteCanvas() { 
		setSize(1000,400); 
		setBackground( Color.BLUE );
		
	}
	
	@Override 
	public void paint(Graphics g) {
		System.out.println("hi");
		Graphics2D g2; 
		g2 =  (Graphics2D) g;
	}
	
}