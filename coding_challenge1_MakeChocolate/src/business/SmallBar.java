package business;

public class SmallBar extends Chocolate {
	// instance variables/fields
	private int barSize;
	
	public SmallBar(int barCount, int barSize) {
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
