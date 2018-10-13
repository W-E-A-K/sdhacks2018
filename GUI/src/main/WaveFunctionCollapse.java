package main;

import wave.music.WaveFunction;
import wave.music.note.CollapsedNote;
import wave.music.note.Note;
import wave.music.song.InputSong;
import wave.music.song.OutputSong;

public class WaveFunctionCollapse {

	public static void main(String[] args) {
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
			System.out.println("Song:");
			
			OutputSong outputSong = func.getCompleteSong();
			for(Note n: outputSong.getNotes()) {
				if(n instanceof CollapsedNote)
					System.out.print(((CollapsedNote) n).getNote() + " ");
				else
					System.out.print("? ");
			}
			System.out.println();
		}
	}
	
}