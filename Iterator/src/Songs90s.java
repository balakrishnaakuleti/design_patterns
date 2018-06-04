import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class Songs90s implements CreateIterator{

	Hashtable<Integer, Song> songs;
	int count;
	public Songs90s(){
		count =0;
		songs = new Hashtable<Integer, Song>();
		songs.put(count, new Song("Tuhi Mera Shab","Gangstar","1992"));
		count++;
	}
	
	public void addSong(String name, String movieName, String year){
		songs.put(count, new Song(name, movieName, year));
		count++;
	}

	@Override
	public Iterator createIterator() {
		return songs.values().iterator();
	}
}
