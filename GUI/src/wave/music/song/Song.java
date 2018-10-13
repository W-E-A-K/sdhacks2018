package wave.music.song;

import java.util.ArrayList;

import wave.music.note.Note;

public class Song {
	private ArrayList<Note> notes;
	
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
}

