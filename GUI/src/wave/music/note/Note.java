package wave.music.note;

public abstract class Note {
	
	private Note prevNote;
	private Note nextNote;
	
	public abstract boolean isCollapsed();
	
	public Note getPrevNote() {
		return prevNote;
	}
	
	public Note getNextNote() {
		return nextNote;
	}
	
	public void setPrevNote(Note note) {
		prevNote = note;
	}
	
	public void setNextNote(Note note) {
		nextNote = note;
	}
}
