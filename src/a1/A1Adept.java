package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		

		// Takes in count of different items customers could have
		int itemCount = scan.nextInt();
	
	
		// Create two arrays storing the names and prices of each item
		String[] foodNames = new String[itemCount];
		double[] foodCost = new double[itemCount];
			
		
		// Loops through each item and stores name and price in respective arrays
		
		for (int i = 0; i < itemCount; i++) {
			foodNames[i] = scan.next();
			foodCost[i] = scan.nextDouble();
		}
		
		
		// Take in count of customers
		int customerCount = scan.nextInt();
		
		
		// Create array with each customer's name
		String[] customers = new String[customerCount];
		
		
		// Create array with each customer's total price
		double[] totalCosts = new double[customerCount];
		
		
		// Loop through each customer
		for (int i=0; i < customerCount; i++) {
			
			// Store each customer's full name in customers array
			customers[i] = scan.next() + " " + scan.next();
			
			// Take in # of items per customer inside the loop and create pricePerCustomer
			int customerItems = scan.nextInt();
			double costPerCustomer = 0;
			
			// Loop through each item each customer has
			for (int j = 0; j < customerItems; j++) {
				// Use helper function to find the total cost
				double num = scan.nextDouble();
				String name = scan.next();
				costPerCustomer = costPerCustomer + (num * foodCost[idxOfItem(name, foodNames)]);
				
			}
			
			// Store the pricePerCustomer in totalCosts array
			totalCosts[i] = costPerCustomer;
			
		}
		
		
		scan.close();
			
		
		System.out.println("Biggest: " + customers[idxOfBiggest(totalCosts)] + " (" + String.format("%.2f", totalCosts[idxOfBiggest(totalCosts)]) + ")");
		System.out.println("Smallest: " + customers[idxOfSmallest(totalCosts)] + " (" + String.format("%.2f", totalCosts[idxOfSmallest(totalCosts)]) + ")");
		System.out.println("Average: " + String.format("%.2f", average(totalCosts)));
		
		
		
		
	}
	
	// Helper function that finds the index of a certain item given its name and item array
	static int idxOfItem(String name, String[] menu) {
		int idx = 0;
		
		for (int k = 0; k < menu.length; k++) {
			if (name.contentEquals(menu[k])) {
				idx = k;
				
			}
		}	
		return idx;
	}
		
	static int idxOfBiggest(double[] costs) {
		int idx = 0;
		double big = 0;
		for (int i = 0; i < costs.length; i++) {
			if (costs[i] > big) {
				idx = i;
			}
		}
		return idx;
	}
	
	static int idxOfSmallest(double[] costs) {
		int idx = 0;
		double small = 0;
		for (int i = 0; i < costs.length; i++) {
			if (costs[i] < small) {
				idx = i;
			}
		}
		return idx;
	}
	
	static double average(double[] costs) {
		double sum = 0;
		for (int i = 0; i < costs.length; i++) {
			sum += costs[i];
		}
		return sum / costs.length;
	}
}
