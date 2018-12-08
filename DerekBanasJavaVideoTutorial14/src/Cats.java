
public class Cats extends Animals {
	public String favToy = "Yarn";
	
	// constructors
	public Cats() {
		
	}
	
//	public Cats(String name, String favFood, String favToy) {
//		this.changeName(name);
//		this.favFood = favFood;
//	}
	
	// Cats constructor - we 
	public Cats(String name, String favFood, String favToy) {
		super(name, favFood);
		this.favToy = favToy;
	}
	
	
	// 
	
	// Cat class methods
	public void playWith() {
		System.out.println("Yeah " + favToy);
	}
	
	public void walkAround() {
		System.out.println(this.getName() + " stalks around.");
	}
	
	public String getToy() {
		return this.favToy;
	}
	
	
}
