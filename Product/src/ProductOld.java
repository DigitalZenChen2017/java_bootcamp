
public class ProductOld {
	
	private String code;
	private String description;
	private double price;
	
	// empty or default constructor
	public ProductOld() {
		code = "";
		description = "";
		price = 0.0;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String c) {
		code = c;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String d) {
		description = d;
	}
	
	public void getPrice() {
		price = 0.0;
	}
	
	public void setPrice(double p) {
		price = p;
	}
}
