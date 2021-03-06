package business;

import db.StuffyDB;

public final class Stuffie {
	// declare private instant variables
	private int id;
	private String type;
	private String size;
	private String color;
	
	// generate constructor with fields
	public Stuffie() {
		
	}
	
	// constructor used in addStuffie method
	public Stuffie(StuffyDB db, String type, String size, String color) {
		super();
		this.id = db.getNextStuffieID();
		this.type = type;
		this.size = size;
		this.color = color;
	}
	
	// constructor for populating initial 10 stuffy objects
	public Stuffie(int id, String type, String size, String color) {
		this.id = id;
		this.type = type;
		this.size = size;
		this.color = color;
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
		return size + " " + color + " " + type;
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
