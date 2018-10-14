package main;

import ui.Window;
import wave.music.WaveFunction;
import wave.music.note.CollapsedNote;
import wave.music.song.InputSong;
import wave.music.song.Song.NoteLetters;

public class WaveFunctionCollapse {

	public static void main(String[] args) {
        
		InputSong song = new InputSong();
		/*
		// Twinkle Twinkle Little Star
		song.addNote(new CollapsedNote(NoteLetters.C4));
		song.addNote(new CollapsedNote(NoteLetters.C4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.F4));
		song.addNote(new CollapsedNote(NoteLetters.F4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.C4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.F4));
		song.addNote(new CollapsedNote(NoteLetters.F4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.F4));
		song.addNote(new CollapsedNote(NoteLetters.F4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.C4));
		song.addNote(new CollapsedNote(NoteLetters.C4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.F4));
		song.addNote(new CollapsedNote(NoteLetters.F4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.C4));
		*/
		
		/*
		//FRondo Alla Turca
		song.addNote(new CollapsedNote(NoteLetters.B4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.G3$));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.C4));
		song.addNote(new CollapsedNote(NoteLetters.REST));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.C4));
		song.addNote(new CollapsedNote(NoteLetters.B4));
		song.addNote(new CollapsedNote(NoteLetters.C4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.REST));
		song.addNote(new CollapsedNote(NoteLetters.F4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.D4$));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.B5));
		song.addNote(new CollapsedNote(NoteLetters.A5));
		song.addNote(new CollapsedNote(NoteLetters.G4$));
		song.addNote(new CollapsedNote(NoteLetters.A5));
		song.addNote(new CollapsedNote(NoteLetters.B5));
		song.addNote(new CollapsedNote(NoteLetters.A5));
		song.addNote(new CollapsedNote(NoteLetters.G4$));
		song.addNote(new CollapsedNote(NoteLetters.A5));
		song.addNote(new CollapsedNote(NoteLetters.C5));
		song.addNote(new CollapsedNote(NoteLetters.A5));
		song.addNote(new CollapsedNote(NoteLetters.C5));
		song.addNote(new CollapsedNote(NoteLetters.G4$));
		song.addNote(new CollapsedNote(NoteLetters.A5));
		song.addNote(new CollapsedNote(NoteLetters.B5));
		song.addNote(new CollapsedNote(NoteLetters.A5));
		song.addNote(new CollapsedNote(NoteLetters.G4$));
		song.addNote(new CollapsedNote(NoteLetters.A5));
		song.addNote(new CollapsedNote(NoteLetters.G4$));
		song.addNote(new CollapsedNote(NoteLetters.A5));
		song.addNote(new CollapsedNote(NoteLetters.B5));
		song.addNote(new CollapsedNote(NoteLetters.A5));
		song.addNote(new CollapsedNote(NoteLetters.G4$));
		song.addNote(new CollapsedNote(NoteLetters.A5));
		song.addNote(new CollapsedNote(NoteLetters.F4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.C4));
		song.addNote(new CollapsedNote(NoteLetters.B4));
		*/
		
		// The Nutcracker Suite
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.F4$));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.C4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.C4$));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.B4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.G3));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.G3));
		song.addNote(new CollapsedNote(NoteLetters.G3));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.F3$));
		song.addNote(new CollapsedNote(NoteLetters.F3$));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.B4));
		song.addNote(new CollapsedNote(NoteLetters.B4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.G3));
		song.addNote(new CollapsedNote(NoteLetters.G3));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.G3));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.F4$));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.G4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.C4));
		song.addNote(new CollapsedNote(NoteLetters.E4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.C4$));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.B4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.G3));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.G3));
		song.addNote(new CollapsedNote(NoteLetters.G3));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.F3$));
		song.addNote(new CollapsedNote(NoteLetters.F3$));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.B4));
		song.addNote(new CollapsedNote(NoteLetters.B4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.A4));
		song.addNote(new CollapsedNote(NoteLetters.D4));
		song.addNote(new CollapsedNote(NoteLetters.G3));
		song.addNote(new CollapsedNote(NoteLetters.E3));
		song.addNote(new CollapsedNote(NoteLetters.G3));
		
		
		WaveFunction func = new WaveFunction(song);
		
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		new Thread(new Window(func)).start();
	}
	
}