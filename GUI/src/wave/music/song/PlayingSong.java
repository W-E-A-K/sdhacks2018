package wave.music.song;

public class PlayingSong implements Runnable {
	private Song song;
	
	public PlayingSong(Song song) {
		this.song = song;
	}

	@Override
	public void run() {
		System.out.println("test");
		song.playSong();
	}

}
