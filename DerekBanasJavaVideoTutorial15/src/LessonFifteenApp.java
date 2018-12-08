
public abstract class LessonFifteenApp {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(4, 120.00);
		
		System.out.println("Cars # of Wheels: " + car.getWheel());	
		System.out.println("Cars Max Speed: " + car.getSpeed());
		
		car.setCarStrength(10);
		System.out.println("Car Strength: " + car.getCarStrength());	
	}

}
