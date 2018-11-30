
public class TestApp {

	public static void main(String[] args) {
		
		// creating 2 instances of Test object
		Test a = new Test();
		Test b = new Test();
		
		a.setVar1("This is a");
		b.setVar1("This is b");
		
		// calling methods from Test class
		System.out.println(a.getVar1());
		System.out.println(b.getVar1());
		
		System.out.println(rollDice());
		System.out.println(rollDice(1000));
	}
	
	public static int rollDice() {
		return (int) (Math.random() * 6) + 1;
	}
	public static int rollDice(int a) {
		return (int) (Math.random() * a) + 1;
	}
}
