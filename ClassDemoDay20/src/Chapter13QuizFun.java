
public class Chapter13QuizFun {

	public static void main(String[] args) {
//		String string1 = "118-45-9271";
//		System.out.println(string1);
//		String string2 = "";
//		for (int i = 0; i < string1.length(); i++) {
//			if(string1.charAt(i) != '-') {
//				string2 += string1.charAt(i);
//				System.out.println(string2);
//			}
//			string2 = string2.replace('-', '.');
//		}
//		
//		System.out.println(string2);
		
		
		// HackerRank Challenge - Java If-Else
		int n = 10;
		if ( n % 2 != 0) {
			System.out.println("Weird");
		}
		
		if (n % 2 == 0 && n >= 2 && n <=5) {
			System.out.println("Not Weird");
		}
		else if (n % 2 == 0 && n >=6 && n <= 20) {
			System.out.println("Weird");
		}
		else if (n % 2 == 0 && n > 20) {
			System.out.println("Not Weird");
		}
		
		

	}

}
