package thenewBoston_javatutorial_36;

public class TimeClassExampleApp {

	public static void main(String[] args) {
		tuna tunaObject = new tuna();
		
		System.out.println(tunaObject.displayTime());
		
		tunaObject.setTime(13, 27, 6);
		System.out.println(tunaObject.displayTime());
		
		
	}

}
