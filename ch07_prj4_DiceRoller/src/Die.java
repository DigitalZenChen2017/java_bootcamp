
public class Die {
	
	// instance variables
	private int value;
	
	// the constructor
	public Die() {
		value = 0;
	}
	
	public void roll() {
		value = (int) (Math.random() * 6) + 1;
	}
	
	
}
