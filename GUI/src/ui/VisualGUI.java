package ui;
/*
 * HelloWorldSwing.java requires no other files. 
 */
import java.awt.Panel;

import javax.swing.*;        

public class VisualGUI {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Musical Notes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("One day I'll make something of myself");
        frame.getContentPane().add(label);

        //Display the window.
        frame.pack();
        frame.setSize(3000, 1500);
        
        Panel controlPanel = new Panel(); 
        controlPanel.add( new Circling() ); 
        
        frame.add(controlPanel);
        frame.setLocation( 100, 100);
        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}