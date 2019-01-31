package business;

import db.StuffieDB;

public final class Stuffie {
	// declare private instant variables
	private int id;
	private String type;
	private String color;
	private String size;

	// generate constructor with fields
	public Stuffie() {

	}

	// constructor used in addStuffie method
	public Stuffie(StuffieDB db, String type, String color, String size) {
		super();
//		this.id = db.getNextStuffieID();
		this.type = type;
		this.color = color;
		this.size = size;
	}

	// constructor for populating initial 10 stuffy objects
	public Stuffie(int id, String type, String color, String size) {
		this.id = id;
		this.type = type;
		this.color = color;
		this.size = size;
	}

	public Stuffie(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return id + " " + size + " " + color + " " + type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean stuffyExists(int id) {
		if (this.id == id) {
			return true;
		}
		return false;
	}

}
