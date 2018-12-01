
public class Album extends Product {
	
	// declare instant variables
	private String artist;
	
	// generate constructor
	public Album(String artist) {
		super();
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return super.toString() +
			"(" + artist + ")";
	}
	
}
