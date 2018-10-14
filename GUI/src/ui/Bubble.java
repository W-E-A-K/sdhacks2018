package ui;

import java.awt.Color;
import java.awt.Point;

public class Bubble {
	private int radius; 
	private int xLoc, yLoc; 
	private Color c; 
	
	public Bubble( int x, int y, Color color ) { 
		radius = 1;
		xLoc = x;
		yLoc = y; 
		c = color; 
	}
	
	public void growBubble() { 
		radius += 1; 
	}
	
	public int getRadius() { 
		return radius; 
	}
	
	public int getOriginX() { 
		return xLoc; 
	}
	
	public int getOriginY() { 
		return yLoc; 
	}
	
	public Color getColor() { 
		return c; 
	}
	
}
