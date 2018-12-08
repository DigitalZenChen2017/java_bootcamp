
public class Student implements Printable, Cloneable {
	
	// instance variables
	private int id;
	private String firstName;
	private String lastName;
	
	// constructors
	public Student(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// generate getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	// include print method from Printable
	public String print() {
		return "Student(" + id +"): " +firstName + " " + lastName;
	}
}
