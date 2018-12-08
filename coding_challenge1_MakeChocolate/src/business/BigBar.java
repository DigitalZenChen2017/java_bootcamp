package business;

public class BigBar extends Chocolate {
	// instance variables/fields
	private int barSize;
	
	// constructor with 2 arguments
	public BigBar(int barCount, int barSize) {
		super(barCount);
		this.barSize = barSize;
	}

	public int getBarSize() {
		return barSize;
	}

	public void setBarSize(int barSize) {
		this.barSize = barSize;
	}
	
	public String toString() {
		return barCount + " " + barSize;
		
	}
	
}
