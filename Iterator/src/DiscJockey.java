import java.util.Iterator;

public class DiscJockey {
	
	Songs70s songs70s;
	Songs80s songs80s;
	Songs90s songs90s;

	

	public DiscJockey(Songs70s songs70s, Songs80s songs80s, Songs90s songs90s ) {
		this.songs70s=songs70s;
		this.songs80s=songs80s;
		this.songs90s=songs90s;
	}
	
	public void displaySongs(){
		
		System.out.println("SONGS OF 70S-----------------------------");
		Iterator iterator1 = songs70s.createIterator();
		showSongs(iterator1);
		System.out.println("SONGS OF 80S-----------------------------");
		Iterator iterator2 = songs80s.createIterator();
		showSongs(iterator2);
		System.out.println("SONGS OF 90S-----------------------------");
		Iterator iterator3 = songs90s.createIterator();
		showSongs(iterator3);
	}

	private void showSongs(Iterator iterator) {

		while(iterator.hasNext()){
			Song song = (Song) iterator.next();
			if(null !=song){
				System.out.println("Song details : "+song.getSongName()+" - "+song.getMovieName()+"  "+song.getYear());
			}
		}
		
	}
}
