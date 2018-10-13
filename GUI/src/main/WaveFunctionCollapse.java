package main;

import ui.Window;
import wave.music.WaveFunction;
import wave.music.note.CollapsedNote;
import wave.music.song.InputSong;

public class WaveFunctionCollapse {

	public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Window();
            }
        });
        
		InputSong song = new InputSong();
		song.addNote(new CollapsedNote(0));
		song.addNote(new CollapsedNote(1));
		song.addNote(new CollapsedNote(2));
		song.addNote(new CollapsedNote(3));
		song.addNote(new CollapsedNote(2));
		song.addNote(new CollapsedNote(1));
		song.addNote(new CollapsedNote(0));
		song.addNote(new CollapsedNote(1));
		song.addNote(new CollapsedNote(3));
		song.addNote(new CollapsedNote(1));
		song.addNote(new CollapsedNote(2));
		song.addNote(new CollapsedNote(1));
		song.addNote(new CollapsedNote(3));
		song.addNote(new CollapsedNote(1));
		song.addNote(new CollapsedNote(2));
		song.addNote(new CollapsedNote(1));
		song.addNote(new CollapsedNote(2));
		song.addNote(new CollapsedNote(3));
		song.addNote(new CollapsedNote(2));
		song.addNote(new CollapsedNote(1));
		song.addNote(new CollapsedNote(0));
		WaveFunction func = new WaveFunction(song);
		
		while(!func.complete()) {
			func.update();
			
		}
	}
	
}