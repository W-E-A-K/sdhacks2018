package wave.music.song;

import java.util.ArrayList;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

import wave.music.note.CollapsedNote;
import wave.music.note.Note;

public class Song {
	private ArrayList<Note> notes;
	
	private AudioFormat af = new AudioFormat(NoteLetters.SAMPLE_RATE, 8, 1, true, true);
	
	public Song() {
		this.notes = new ArrayList<Note>();
	}
	
	public ArrayList<Note> getNotes(){
		return notes;
	}
	
	public void addNote(Note note) {
		if(getNotes().size() != 0) {
			getNotes().get(getNotes().size() - 1).setNextNote(note);
			note.setPrevNote(getNotes().get(getNotes().size() - 1));
		}
		getNotes().add(note);
	}
	
	public void playSong() {
		try {
			SourceDataLine line = AudioSystem.getSourceDataLine(af);
	        line.open(af, NoteLetters.SAMPLE_RATE);
			
	        line.start();
	        for  (Note n : getNotes()) {
	            play(line, NoteLetters.values()[1 + ((CollapsedNote) n).getNote()], ((CollapsedNote) n).getLength() * 500);
	            play(line, NoteLetters.REST, 10);
	        }
	        line.drain();
	        line.close();
		}catch(Exception e) {
			System.out.println("FAILED");
		}
	}
	
	private void play(SourceDataLine line, NoteLetters note, int ms) {
        ms = Math.min(ms, NoteLetters.SECONDS * 1000);
        int length = NoteLetters.SAMPLE_RATE * ms / 1000;
        int count = line.write(note.data(), 0, length);
    }
	
	public enum NoteLetters {

	    REST, D3, D3$, E3, F3, F3$, G3, G3$, A4, A4$, B4, C4, C4$, D4, D4$, E4, F4, F4$, G4, G4$, A5, A5$, B5, C5, C5$, D5, D5$, E5, F5, F5$, G5, G5$;
	    public static final int SAMPLE_RATE = 16 * 1024; // ~16KHz
	    public static final int SECONDS = 2;
	    private byte[] sin = new byte[SECONDS * SAMPLE_RATE];

	    NoteLetters() {
	    	int n = this.ordinal();
	        if (n > 0) {
	            double exp = ((double) n - 8) / 12d;
	            double f = 440d * Math.pow(2d, exp);
	            for (int i = 0; i < sin.length; i++) {
	                double period = (double)SAMPLE_RATE / f;
	                double angle = 2.0 * Math.PI * i / period;
	                sin[i] = (byte)(Math.sin(angle) * 127f);
	            }
	        }
	    }

	    public byte[] data() {
	        return sin;
	    }
	}
}



