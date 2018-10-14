package ui;
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;

import wave.music.WaveFunction;
import wave.music.note.CollapsedNote;
import wave.music.note.Note;

@SuppressWarnings("serial")
public class NoteCanvas extends Canvas {
	private WaveFunction function;
	
	public NoteCanvas(WaveFunction function) {
		this.function = function;
		setSize(1000,400); 
		setBackground( Color.WHITE );
		
	}
	
	public void update() {
		Graphics2D g2 = (Graphics2D) getGraphics(); 
		g2.setStroke(new BasicStroke(3));
		
		for(int i = 0; i < function.getInputSong().getNotes().size(); i++) {
			if(i % 4 == 0) {
				drawBar(g2, 100 / 4 * (i % 40), 30 + 80 * (i / 40));
			}
			drawNote(g2, 100 / 4 * (i % 40), 30 + 80 * (i / 40), function.getInputSong().getNotes().get(i));
		}
		
		for(int i = 0; i < function.getCompleteSong().getNotes().size(); i++) {
			if(i % 4 == 0) {
				drawBar(g2, 100 / 4 * (i % 40), 200 + 80 * (i / 40));
			}
			drawNote(g2, 100 / 4 * (i % 40), 200 + 80 * (i / 40), function.getCompleteSong().getNotes().get(i));
		}
		
	}
	
	public void drawBar(Graphics2D g2, int x, int y) {
		// draw the left bar
		g2.drawLine(x, y+40, x, y);
		// draw the right bar
		g2.drawLine(x+100, y, x+100, y+40);
		
		// draw the 5 horizontal bars
		g2.drawLine(x, y, x+100, y);
		g2.drawLine(x, y+10, x+100, y+10);
		g2.drawLine(x, y+20, x+100, y+20);
		g2.drawLine(x, y+30, x+100, y+30);
		g2.drawLine(x, y+40, x+100, y+40);
	}
	
	public void drawNote(Graphics2D g2, int x, int y, Note note) {
		if(note instanceof CollapsedNote)
			g2.drawArc(x + 3, y - 3 + 5 * (6 - ((CollapsedNote) note).getNote()), 5, 5, 0, 360);
	}
	
}