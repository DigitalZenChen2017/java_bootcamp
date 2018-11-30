import java.util.Scanner;

public class Test {
	public Test() {
		super();
		
	}
	
	private String var1 = "";

	public String getVar1() {
		return var1;
	}

	public void setVar1(String var1) {
		this.var1 = var1;
	}

	public int rollDice() {
		return (int) (Math.random() * 6) + 1;
	}
	
	public String getStringchoice(Scanner sc, String prompt, String choice1, String choice2) {
		String s = "";
		boolean isValid = false;
		do {
			System.out.print(prompt);
			s = sc.next();
			sc.nextLine();
			
			if (s.equalsIgnoreCase(choice1)|| s.equalsIgnoreCase(choice2)) {
				isValid = true;
			}
		} while(!isValid);
		return s;
	}
	
}
