package wave.music.song;

import java.util.ArrayList;

import wave.music.note.CollapsedNote;
import wave.music.note.Note;
import wave.music.note.UncollapsedNote;

public class OutputSong extends Song {
	
	public OutputSong(int length) {
		for(int i = 0; i < length; i++) {
			addNote(new UncollapsedNote());
		}
	}
	
	public void update(Song song) {
		ArrayList<Note> notes = getNotes();
		
		
		for(int i = 0; i < notes.size(); i++) {
			if(!notes.get(i).isCollapsed()) {
				((UncollapsedNote) notes.get(i)).updateOptionArray(song);
			}
		}
		
		int minCollapsedNoteIndex;
		do {
			minCollapsedNoteIndex = (int)(Math.random() * notes.size());
		}while(notes.get(minCollapsedNoteIndex) instanceof CollapsedNote);

		for(int i = 0; i < notes.size(); i++) {
			if(!notes.get(i).isCollapsed()) {
				if(((UncollapsedNote) notes.get(i)).getCollapsedIndex() < ((UncollapsedNote) notes.get(minCollapsedNoteIndex)).getCollapsedIndex()) {
					minCollapsedNoteIndex = i;
				}
			}
		}
		
		collapseNote(minCollapsedNoteIndex, song);
		
	}
	
	private void collapseNote(int index, Song song) {
		UncollapsedNote oldNote = ((UncollapsedNote) getNotes().get(index));
		Note newNote = oldNote.collapse(song);
		if(oldNote.getPrevNote() != null) {
			newNote.setPrevNote(oldNote.getPrevNote());
			oldNote.getPrevNote().setNextNote(newNote);
		}
		if(oldNote.getNextNote() != null) {
			newNote.setNextNote(oldNote.getNextNote());
			oldNote.getNextNote().setPrevNote(newNote);
		}
		getNotes().set(index, newNote);
	}
	
	public boolean complete() {
		ArrayList<Note> notes = getNotes();
		
		for(int i = 0; i < notes.size(); i++) {
			if(!notes.get(i).isCollapsed()) {
				return false;
			}
		}
		return true;
	}

}
