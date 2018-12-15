package business;

public final class Stuffie {
	// declare private instant variables
	private int id;
	private String type;
	private String size;
	private String color;
	
	// generate constructor with fields
	
	public Stuffie(int id, String type, String size, String color) {
		super();
		this.id = id;
		this.type = type;
		this.size = size;
		this.color = color;
	}
	
	public Stuffie(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Stuffie [id=" + id + ", type=" + type + ", size=" + size + ", color=" + color + "]";
	}
	
	
	
}
