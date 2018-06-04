
public class Song extends SongComponent {

	private String songName;
	private String bandName;
	private int year;
	
	public Song(String songName, String bandName, int year){
		this.songName=songName;
		this.bandName=bandName;
		this.year=year;
	}
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getBandName() {
		return bandName;
	}
	public void setBandName(String bandName) {
		this.bandName = bandName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void displaySongComponent(){
		System.out.println("Song Name: "+songName+"    Band Name: "+bandName+"  Year :  "+year);
	}
}
