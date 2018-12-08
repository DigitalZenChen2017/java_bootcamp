// Class where we'll "implement" the interface. 
// You MUST define EVERY method inside your interface.
// Any method pulled from an interface must be as VISIBLE as interface itself!
public class Vehicle extends Crashable implements Drivable {
	
	// fields
	int numOfWheels = 2;
	double theSpeed = 0;
	
	int carStrength = 0;
	
	public int getWheel() {
		return this.numOfWheels;
	}
	
	public void setWheels(int numWheels) {
		this.numOfWheels = numWheels;
		// set class variable equal to local variable
	}
		
	
	public double getSpeed() {
		return this.theSpeed;
	}
		
	
	public void setSpeed(double speed){
		this.theSpeed = speed;
	}
	
	// 2 constructors
	public Vehicle(int wheels, double speed) {
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}
	
	public Vehicle(int wheels, double speed, int strength) {
		this.numOfWheels = wheels;
		this.theSpeed = speed;
		this.carStrength = strength;
	}
	
	public void setCarStrength(int carStrength) {
		this.carStrength = carStrength;
	}
	
	public int getCarStrength() {
		return carStrength;
	}
}
