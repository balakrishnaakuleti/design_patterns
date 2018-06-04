import java.util.Arrays;
import java.util.Iterator;

public class Songs70s implements CreateIterator{

	Song[] songs;
	int count;
	public Songs70s(){
		count=0;
		songs = new Song[2];
		songs[0]=new Song("Ye dosthi","Sholay","1971");
		count++;
	}
	
	public void addSong(String name, String movieName, String year){
		songs[count]= new Song(name, movieName, year);
		count++;

	}

	@Override
	public Iterator createIterator() {
		return Arrays.asList(songs).iterator();
	}
}
