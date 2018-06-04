
public class RadioStationTest {

	public static void main(String[] args) {
		Songs70s songs70s = new Songs70s();
		songs70s.addSong("Rabba", "Sholay", "1977");
		
		Songs80s songs80s = new Songs80s();
		songs80s.addSong("Tumse pyar", "DDLJ", "1982");
		
		Songs90s songs90s = new Songs90s();
		songs90s.addSong("Bheegi Bheegi", "Gangstart", "1992");
		
		DiscJockey jockey = new DiscJockey(songs70s, songs80s, songs90s);
		jockey.displaySongs();
	}
}
