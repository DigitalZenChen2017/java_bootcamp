
public class BorisCh7TestApp {

	public static void main(String[] args) {
		BorisCh7Test testObject = new BorisCh7Test("Black", "Chinese", "Muscular", "5'7.5", "174.5 lb");
		System.out.println("My Hair Color: "+testObject.getHairColor());
		System.out.println("My Ethnicity: "+testObject.getEthnicity());
		System.out.println("My Body Type: "+testObject.getBodyType());
		System.out.println("My Height: "+testObject.getHeight());
		System.out.println("My Weight: "+testObject.getWeight());
	}
	
	

}
