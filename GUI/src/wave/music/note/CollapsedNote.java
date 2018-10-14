package wave.music.note;

import wave.music.song.Song.NoteLetters;

public class CollapsedNote extends Note {
	private int note; // 1 = A, 2 = B, etc.
	private int length; // 1 = quarter note
	
	public CollapsedNote(int note) {
		this.note = note;
		this.length = 1;
	}
	
	public CollapsedNote(NoteLetters note) {
		this.note = note.ordinal();
		this.length = 1;
	}

	@Override
	public boolean isCollapsed() {
		return true;
	}
	
	public int getNote() {
		return note;
	}

}
