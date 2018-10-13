package ui;

import java.awt.Panel;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Window {
	
	private Panel controlPanel;

	
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
	public Window() {

        //Create and set up the window.
        JFrame frame = new JFrame("Musical Notes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        controlPanel = new Panel(); 
        controlPanel.add( new Circling( 2 ) );
        controlPanel.add( new Circling( 1 ) );
        controlPanel.setLayout(new BoxLayout(controlPanel, 1));
        
        frame.add(controlPanel);
        frame.setLocation( 0, 0);
        frame.setVisible(true);
        
        //Display the window.
        frame.pack();
	}

}
