package ui;

import java.awt.Point;

public class Bubble {
	private int radius; 
	private int xLoc, yLoc; 
	
	public Bubble( int x, int y) { 
		radius = 1;
		xLoc = x;
		yLoc = y; 
	}
	
	public void growBubble() { 
		radius += 3; 
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
	
}
