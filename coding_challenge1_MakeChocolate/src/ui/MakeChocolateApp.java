package ui;

import business.BigBar;
import business.SmallBar;

public class MakeChocolateApp {

	public static void main(String[] args) {
	// create a Small bar object
	SmallBar Smallbar = new SmallBar(1, 1); // 1 barCount and 1 kilo barSize
	BigBar big = new BigBar(1, 5);
	
	System.out.println("Total Number of Small Bars: " + makeChocolate(4, 1, 9));
	
	System.out.println("Total Number of Small Bars: " + makeChocolate(4, 1, 10));
	
	System.out.println("Total Number of Small Bars: " + makeChocolate(4, 1, 7));

	}
	
	public static int makeChocolate(int smallQuantity, int bigQuantity, int goal) {
		int bigSize = bigQuantity * 5;
		int smallSize = smallQuantity * 1;
		int totalSize = bigSize + smallSize;
//		goal - bigSize
		if (totalSize == goal) {
			return smallSize;
		} else
			return totalSize - goal;
	}	
		

}
