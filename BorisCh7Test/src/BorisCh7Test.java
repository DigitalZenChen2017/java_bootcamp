
public class BorisCh7Test {
	// instance variables or fields
	private String hairColor;
	private String ethnicity;
	private String bodyType;
	private String height;
	private String weight;
	
//	// constructor defaults height and weight
//	public BorisCh7Test(String borisHeight, String borisWeight) {
//		height = borisHeight;
//		weight = borisWeight;
//		
//	}
	
	// constructors
	public BorisCh7Test(String hairColor, String ethnicity, String bodyType, String height, String weight) {
		super();
		this.hairColor = hairColor;
		this.ethnicity = ethnicity;
		this.bodyType = bodyType;
		this.height = height;
		this.weight = weight;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
//	public BorisCh7Test(String height, String weight) {
//		super();
//		this.hairColor = hairColor;
//		this.ethnicity = ethnicity;
//		this.bodyType = bodyType;
//		this.height = height;
//		this.weight = weight;
//	}
	
	
	
}
