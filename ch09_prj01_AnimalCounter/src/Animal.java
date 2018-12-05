
public abstract class Animal implements Countable {
	
	// instance variables
	protected int animalCount;
	
	public Animal() {
		this.animalCount=0;
	}

	@Override
	public void incrementCount() {
		this.animalCount++;
	}

	@Override
	public void resetCount() {
		this.animalCount = 0;

	}

	@Override
	public int getCount() {
		return animalCount;
	}

	@Override
	public String getCountString() {
		 return null;
	}

}
