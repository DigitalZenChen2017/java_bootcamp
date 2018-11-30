
public class Contact {
	
	// initialize instance variables
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	// Create instance of Contact class and initialize variables to default values
    public Contact() {
        firstName = "";
        lastName = "";
        email = "";
        phone = "";
    }
    
    // Add Constructor to Contact Class 
	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void displayContact() {
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("----Current Contact-----------------------------------------");
		System.out.println("---------------------------------------------");
		
		System.out.println("Name: "+"\t"+getFirstName()+" "+getLastName());
		System.out.println("Email Address: "+"\t"+getEmail());
		System.out.println("Phone Number: "+"\t"+getPhone());
	}
	
        
}
