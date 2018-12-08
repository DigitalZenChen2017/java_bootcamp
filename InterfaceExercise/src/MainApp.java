
public class MainApp {

	public static void main(String[] args) {
		// 2 ways of instantiating a class that implements a method
		
		// 1st way
		DeskPhone d = new DeskPhone(2909828, true);
		
//		borisPhone = new DeskPhone(2909828, true);
//		ITelephone boris
		
		
		
		
//	2nd way	DeskPhone borisPhone = new DeskPhone(2909828, true);
		
		borisPhone.powerOn();
		borisPhone.dial(2909828);
		borisPhone.answer();
		borisPhone.callPhone(2909828)
	
	}

}
