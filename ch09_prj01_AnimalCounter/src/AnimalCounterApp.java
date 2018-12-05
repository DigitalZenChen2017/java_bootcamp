
public class AnimalCounterApp {

	public static void main(String[] args) { 
		System.out.println("Counting alligators...");
		System.out.println("");
		
		Alligator a = new Alligator();
		
		count(a, 3);
		
		Sheep s = new Sheep("Blackie");
		
		System.out.println("Counting sheep...");
		System.out.println("");
		
		count(s, 2);
		
		
		try {
			Sheep s2 =(Sheep) s.clone(); 
			s2.setName("Dolly");
			count(s2, 3);
		}
		catch (CloneNotSupportedException e) {
			System.out.println("Error!");
		}
		
		count(s, 1);
	}
	
	public static void count(Countable c, int maxCount) {
		for(int count = 0; count < maxCount; count++) {
			c.incrementCount();
			System.out.println(c.getCountString());
			
		}
		c.resetCount();
	}
		
		
}
