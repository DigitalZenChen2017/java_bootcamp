
public class Sheep extends Animal implements Cloneable {
	private String name;

	// generate default constructor
	public Sheep(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getCountString() {
		return animalCount + " " + this.name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
