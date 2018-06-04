
public class Song {

	public Song(String songNmae, String movieName, String year) {
		
		this.songName=songNmae;
		this.movieName=movieName;
		this.year=year;
	}
	private String songName;
	private String movieName;
	private String year;
	public String getSongName() {
		return songName;
	}
	public String getMovieName() {
		return movieName;
	}
	public String getYear() {
		return year;
	}
	
}
