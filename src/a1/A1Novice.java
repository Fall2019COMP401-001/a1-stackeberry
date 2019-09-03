package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Takes in  number of customers
		int count = scan.nextInt();
		
		// Set up arrays for first initial, last name, and price
		char[] firstInitials = new char[count];
		
		String[] lastNames = new String[count];
		
		double[] totalPrices = new double[count];
		
		// loop through each customer
		for (int i=0; i<firstInitials.length; i++) {

			firstInitials[i] = scan.next().charAt(0);
			lastNames[i] = scan.next();
			
			// Loop through each item the customer has and calculate total price
			int j = scan.nextInt();
			
			double totalPrice = 0;
			for (int k = 0; k<j; k++) {
				int amount = scan.nextInt();
				var name = scan.next();
				double pricePer = scan.nextDouble();
				totalPrice = totalPrice + (amount * pricePer);
				String.format("%.2f, totalPrice");

				
			}
			totalPrices[i] = totalPrice;
		}
		
		// Print out each customer's first initial
		for (int i=0; i<firstInitials.length; i++) {
			System.out.println(firstInitials[i] + ". " + lastNames[i] + ": " + totalPrices[i]);
		}
		
	}
}
