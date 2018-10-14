package ui;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class CircleCanvas extends Canvas { 
	ArrayList<Bubble> list; 
	private final int width = 1000; 
	private final int height = 400; 
	
	
	public CircleCanvas() { 
		setSize(width,height); 
		setBackground( Color.PINK );
		list = new ArrayList<Bubble>();
	}
	
	public void addCircle() { 
		//make random point for Bubble's origin 
		int x = (int) (width*Math.random() + 100);
		int y = (int) (height* Math.random() + 100);
		System.out.println("Origin is (" + x + ", " + y + ")." );
		Bubble b = new Bubble(x, y); 
		list.add(b); 
		
		//draw initial circle 
		Graphics g = this.getGraphics(); 
		Graphics g2 = (Graphics2D) g;
		g2.fillOval( x - b.getRadius(), y - b.getRadius(), b.getRadius()*2, b.getRadius()*2 );
	
	}
	
	/**
	 * Called every frame to deal with animation 
	 */
	public void updateCircles( ) { 
		Graphics g = this.getGraphics(); 
		Graphics g2 = (Graphics2D) g;
		
		for( Bubble b : list ) { 
			//increase radius of bubble 
			b.growBubble();
			
			//draw on top of old bubbles 
			int x = b.getOriginX() - b.getRadius(); 
			int y = b.getOriginY() - b.getRadius(); 
			g2.fillOval( x, y, b.getRadius()*2, b.getRadius()*2 );
			
			//if bubble radius > certain amount, delete from list 
			if( b.getRadius() > width ) { 
				list.remove(b); 
			}
		}
	}
}