import java.util.ArrayList;
import java.util.Iterator;

public class Songs80s implements CreateIterator{

	ArrayList<Song> songs;
	public Songs80s(){
		songs = new ArrayList<Song>();
		songs.add(new Song("Tuje Dekha","DDLJ","1982"));
	}
	
	public void addSong(String name, String movieName, String year){
		songs.add(new Song(name, movieName, year));
	}

	@Override
	public Iterator createIterator() {
		return songs.iterator();
	}
}
