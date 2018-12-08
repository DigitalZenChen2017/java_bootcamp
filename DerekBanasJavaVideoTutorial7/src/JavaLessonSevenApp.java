
public class JavaLessonSevenApp {

	public static void main(String[] args) {
		// create a new object
		Monster m = new Monster();
		
		m.name = "Boris";
		
		System.out.println(m.name + " has an attack of " + m.getAttack() + "." );

	}

}

/* Key Concepts:
 *  - You CAN access private instance variables/fields inside the SAME class by not outside it! 
 */