
public class FunWithStringsApp {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumped over the log";
		
		// use length() method
		System.out.println("sentence is: " + sentence);
		System.out.println("length is " + sentence.length());
		
		// indexOf()
		int s = sentence.indexOf(" ");
		System.out.println("s = "+s);
		
		//indexOf() 
		int s2 = sentence.indexOf(" ", s+1);
		System.out.println("s2 = "+s2);
		
		// charAt
		char c = sentence.charAt(20);
		System.out.println(c);
		
		// substring
		String str1 = sentence.substring(s);
		System.out.println(str1);
		
		
	}

}
