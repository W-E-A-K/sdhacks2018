package wave.music.note;

import java.util.ArrayList;

import wave.music.song.Song;

public class UncollapsedNote extends Note {
	
	private boolean[] canBeNoteArray;
	private int collapsedIndex;

	@Override
	public boolean isCollapsed() {
		return false;
	}
	
	public boolean canBeNote(CollapsedNote note) {
		if(note.getPrevNote() == null || note.getNextNote() == null) return false;
		if(getPrevNote() != null && note.getPrevNote() != null && getPrevNote().isCollapsed()) {
			if(((CollapsedNote) getPrevNote()).getNote() != ((CollapsedNote) note.getPrevNote()).getNote()) {
				return false;
			}
		}
		if(getNextNote() != null && note.getNextNote() != null && getNextNote().isCollapsed()) {
			if(((CollapsedNote) getNextNote()).getNote() != ((CollapsedNote) note.getNextNote()).getNote()) {
				return false;
			}
		}
		return true;
	}
	
	public void updateOptionArray(Song song) {
		collapsedIndex = 0;
		canBeNoteArray = new boolean[song.getNotes().size()];
		for(int i = 0; i < song.getNotes().size(); i++) {
			canBeNoteArray[i] = canBeNote((CollapsedNote) song.getNotes().get(i));
			if(canBeNoteArray[i]) collapsedIndex++;
		}
	}
	
	public boolean[] getCanBeNoteArray() {
		return canBeNoteArray;
	}
	
	public int getCollapsedIndex() {
		return collapsedIndex;
	}
	
	public CollapsedNote collapse(Song song) {
		ArrayList<Integer> allowedNotes = new ArrayList<Integer>();
		
		for(int i = 0; i < song.getNotes().size(); i++) {
			if(canBeNoteArray[i]) allowedNotes.add(i);
		}
		
		return new CollapsedNote(((CollapsedNote) song.getNotes().get(allowedNotes.get((int) (Math.random() * allowedNotes.size())))).getNote());
	}

}
