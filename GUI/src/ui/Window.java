package ui;

import java.awt.Panel;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import wave.music.WaveFunction;

public class Window implements Runnable {
	
	private Panel controlPanel;
	private WaveFunction function;
	private NoteCanvas noteCanvas;

	
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
	public Window(WaveFunction function) {
		this.function = function;

        //Create and set up the window.
        JFrame frame = new JFrame("Musical Notes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        controlPanel = new Panel(); 
        controlPanel.add( new CircleCanvas() );
        noteCanvas = new NoteCanvas(function);
        controlPanel.add( noteCanvas );
        controlPanel.setLayout(new BoxLayout(controlPanel, 1));
        
        frame.add(controlPanel);
        frame.setLocation( 0, 0);
        frame.setVisible(true);
        
        //Display the window.
        frame.pack();
	}
	
	public void run() {
        while(true) {
    		
    		if(!function.complete()) {
    			function.update();
    			
    		}
    		
    		noteCanvas.update();
        	
        	try{
        		Thread.sleep(200);
        	}
        	catch(InterruptedException e){
        		System.out.println(e);
        	}
        }
    }

}
