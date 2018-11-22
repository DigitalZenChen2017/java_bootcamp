
public class TestJavaApp {
	
	public static void main(String[] args) {
		int zipCode = 93706;
		int routeNumber;
		switch(zipCode) {
		case 93705:
		case 93706:
			routeNumber = 1;
			System.out.println(routeNumber);
			break;
		case 93710:
		case 93720:
			routeNumber = 2;
			System.out.println(routeNumber);
			break;
		default:
			routeNumber = 0;
			break;
		}

	}

}

