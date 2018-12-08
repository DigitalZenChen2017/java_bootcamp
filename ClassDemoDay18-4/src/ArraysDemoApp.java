import java.util.Arrays;

public class ArraysDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		// declare a new array of 5
		int[] numbers = new int[5];
		numbers[0] = 100; // set position equal to value
		numbers[1] = 90;
		numbers[2] = 80;
		numbers[3] = 70;
		numbers[4]= 60;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		String[] names = new String[7];
		names [0] = "Yelena";
		names [1] = "Nick";
		names [2] = "Katrina";
		names [3] = "Gary";
		names [4] = "Eric";
		names [5] = "Boris";
		names [6] = "Sean";
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
//		Product[] products = new Product[2];
//		products[0] = new Product()		
//		products[1] = new Pro
		
		System.out.println("An array of prices...");
		double[] prices = {57.50, 60.00, 45.67, 99.99};
		double sum = 0.0;
		for(int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
			sum += prices[i];
		}
		
		System.out.println("Average price: "+ sum/prices.length);
		
		prices[1] = 5;
		prices[3] = 2;
		
		for(double p : prices) {
			System.out.println(p);
		}
		
//		int idx = Arrays.binarySearch(prices, 45.67);
		
//		int sort = Arrays.sort(prices);
		for(double p : prices) {
			System.out.println(p);
		}	
		Arrays.fill(prices, 1.0);
		
		for(double p : prices) {
			System.out.println(p);
		}	
		
		double[] newArray = Arrays.copyOf(prices, 6);
		for(double p : prices) {
			System.out.println(p);
		}
		
//		System.out.println("Array equals..");
//		double newArray2 = Arrays.copyOf(prices, 4);
//		System.out.println();
		
		System.out.println("Bye");

	}

}
