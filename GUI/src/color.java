import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import java.lang.Thread;


class myColor {
	int[] notes;
	int delay = 1000;
	
	myColor(int[] n)
	{
		notes = n;
	}
	
	// returns an array of color objects from notes
	Color[] colorArray()
	{
		Color[] colorArray = new Color[notes.length]; 
		for (int i = 0; i < colorArray.length; ++i)
		{
			colorArray[i] = numToHue(notes[i]);
		}
		return colorArray;
	}
	
	// Color.getHSBColor(hue, saturation, brightness)
	// 					0-1	  1 		  0.5
	// returns a color from the integer
	// take into account the max and min values in the array
	Color numToHue(int n)
	{
		double hue = n*0.1;
		return Color.getHSBColor((float)hue, (float)1, (float)0.5);
	}
	
	void displayColorArray(JFrame f)
	{
		Container c = f.getContentPane();
		Color[] colorArr = colorArray();
		for (int i = 0; i < colorArr.length; ++i)
		{	
			c.setBackground(colorArr[i]);
	        try {
	            // thread to sleep for 1000 milliseconds
	            Thread.sleep(delay);
	        } catch (Exception e) {
	        	System.out.println(e);
	        }
		}
	}
	
}


public class color {
	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		
		int[] notes = new int[] {1,3,8,4,3,2,2,10,1,3,4,0,1,0};
		myColor col = new myColor(notes);
		Color[] colorArr = col.colorArray();
		f.setSize(1000,1000);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  

		col.displayColorArray(f);
	}
}