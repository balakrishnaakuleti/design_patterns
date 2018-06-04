
public class DiscJockey {

	SongComponent root;

	public DiscJockey(SongComponent root) {
		this.root = root;
	}
	
	public void displayAllSongs(){
		root.displaySongComponent();
	}
}
