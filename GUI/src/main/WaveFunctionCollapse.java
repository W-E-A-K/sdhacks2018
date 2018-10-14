package main;

import ui.Window;
import wave.music.WaveFunction;
import wave.music.note.CollapsedNote;
import wave.music.song.InputSong;

public class WaveFunctionCollapse {

	public static void main(String[] args) {
        
		InputSong song = new InputSong();
		song.addNote(new CollapsedNote(0));
		song.addNote(new CollapsedNote(1));
		song.addNote(new CollapsedNote(2));
		song.addNote(new CollapsedNote(3));
		song.addNote(new CollapsedNote(5));
		song.addNote(new CollapsedNote(3));
		song.addNote(new CollapsedNote(4));
		song.addNote(new CollapsedNote(5));
		song.addNote(new CollapsedNote(3));
		song.addNote(new CollapsedNote(4));
		song.addNote(new CollapsedNote(5));
		song.addNote(new CollapsedNote(6));
		song.addNote(new CollapsedNote(7));
		song.addNote(new CollapsedNote(3));
		song.addNote(new CollapsedNote(6));
		song.addNote(new CollapsedNote(3));
		song.addNote(new CollapsedNote(6));
		song.addNote(new CollapsedNote(2));
		song.addNote(new CollapsedNote(1));
		song.addNote(new CollapsedNote(4));
		song.addNote(new CollapsedNote(5));
		WaveFunction func = new WaveFunction(song);
		
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		new Thread(new Window(func)).start();
	}
	
}