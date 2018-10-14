package wave.music.note;

import java.util.ArrayList;

import wave.music.song.Song;

public class UncollapsedNote extends Note {
	
	private boolean[] canBeNoteArray;
	private int collapsedIndex;
	
	private static final int SEARCH_DISTANCE = 3;

	@Override
	public boolean isCollapsed() {
		return false;
	}
	
	public boolean canBeNote(CollapsedNote note) {
		//search in the reverse direction
		Note currNoteOut = this;
		Note currNoteIn = note;
		
		for(int i = 0; i < SEARCH_DISTANCE; i++) {
			if(currNoteOut.getPrevNote() == null) break;
			if(currNoteIn.getPrevNote() == null) return false;

			currNoteOut = currNoteOut.getPrevNote();
			currNoteIn = currNoteIn.getPrevNote();
			
			if(!currNoteOut.isCollapsed()) continue;
			if(((CollapsedNote) currNoteOut).getNote() != ((CollapsedNote) currNoteIn).getNote()) return false;
		}
		
		//search in the forward direction
		currNoteOut = this;
		currNoteIn = note;
		for(int i = 0; i <SEARCH_DISTANCE; i++) {
			if(currNoteOut.getNextNote() == null) break;
			if(currNoteIn.getNextNote() == null) return false;

			currNoteOut = currNoteOut.getNextNote();
			currNoteIn = currNoteIn.getNextNote();
			
			if(!currNoteOut.isCollapsed()) continue;
			
			if(((CollapsedNote) currNoteOut).getNote() != ((CollapsedNote) currNoteIn).getNote()) return false;
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
