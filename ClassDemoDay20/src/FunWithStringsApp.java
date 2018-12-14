
public class FunWithStringsApp {

	public static void main(String[] args) {
		
		// How to join strings
		String name = "Boris";
		String message = "Hi, my name is " + name;
		
		System.out.println(message);
		
		// Appending strings
		name += " Chen";
		
		message = "Hi, my name is " + name;
		System.out.println(message);
		
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
		
		// Chapter 13 Question #6
//		String s1 = "Kristine";
//		s1 += " Thomas";
//		String s3 = s1;
//		if(s1.equals(s3)) {
//			System.out.println("Same");
//		}
//		if(s1 == s3) {
//			System.out.println("equal");
//		}
		
//		// Chapter 13 Question #7
//		String s1 = "805 Main Street";
//		String s3 = "805 Main Street";
//		
//		if(s1.equals(s3)) {
//			System.out.println("Same");
//		}
//		
//		if(s1 == s3) {
//			System.out.println("equal");
//		}
		
		// Chapter 13 Question #8
		String string1 = "118-45-9271";
		String string2 = "";
		for (int i = 0; i < string1.length(); i++) {
			if(string1.charAt(i) != '-') {
				string2 += string1.charAt(i);
			}
			
		}
		string2 = string2.replace('-', '.');
		System.out.println(string2);
		
	}

}
