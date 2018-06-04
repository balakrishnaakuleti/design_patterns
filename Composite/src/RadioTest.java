
public class RadioTest {

	public static void main(String[] args) {
		
		SongComponent rootGroup= new SongGroup("Indian Music", "This is a great collection of all the indian songs.");
		SongComponent southGroup= new SongGroup("South Indian Music", "This is a great collection of all the south indian songs.");
		SongComponent tollyGroup= new SongGroup("Telugu Music", "This is a great collection of all the telugu songs.");
		SongComponent bollyGroup= new SongGroup("Hindi Music", "This is a great collection of all the hindi songs.");
		rootGroup.addComponent(new Song("National Anthem", "Great Indian Musicians", 1947));

		rootGroup.addComponent(bollyGroup);
		rootGroup.addComponent(southGroup);
		southGroup.addComponent(tollyGroup);
		
		tollyGroup.addComponent(new Song("Niru Niru Niru", "Khaidi 150", 2017));
		bollyGroup.addComponent(new Song("Hamma Hamma", "OK Janu", 2017));
		
		DiscJockey jockey = new DiscJockey(rootGroup);
		jockey.displayAllSongs();
	}
	
}
