package wave.music;

import wave.music.song.InputSong;
import wave.music.song.OutputSong;

public class WaveFunction {
	private InputSong inputSong;
	private OutputSong outputSong;
	
	public WaveFunction(InputSong song) {
		inputSong = song;
		outputSong = new OutputSong(100);
	}
	
	public void update() {
		outputSong.update(inputSong);
	}
	
	public boolean complete() {
		return outputSong.complete();
	}

	public OutputSong getCompleteSong() {
		return outputSong;
	}

	public InputSong getInputSong() {
		return inputSong;
	}
}