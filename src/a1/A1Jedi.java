package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemCount = scan.nextInt();
		
		String[] itemNames = new String[itemCount];
		int[] itemCounter = new int[itemCount];
		
	
		
		
		for (int i = 0; i < itemCount; i++) {
			itemNames[i] = scan.next();
			double price = scan.nextDouble();
		}
	
		
		int num = scan.nextInt();
		
		// 2x2 array to track which customer bought which food
		boolean[][] customerCounter = new boolean[itemCount][num];
		
		for (int i = 0; i < customerCounter.length; i++) {
			for (int j = 0; j < customerCounter[i].length; j++) {
				customerCounter[i][j] = false;
			}
		}
		
		// Loop through each customer
		for (int i = 0; i < num; i++) {
			String name = scan.next() + " " + scan.next();
			int numItems = scan.nextInt();
			
			// Loop through each customers items
			for (int j = 0; j < numItems; j++) {
				int numPerItem = scan.nextInt();
				String itemName = scan.next();
				
				// Loop through list of items to check
				for (int k = 0; k < itemNames.length; k++) {
					if (itemName.equals(itemNames[k])) {
						itemCounter[k] += numPerItem;
						customerCounter[k][i] = true;
					}
				}
			}
			
		}
		
		int[] customersPerItem = new int[itemCount];
		
		for (int i = 0; i < customerCounter.length; i++) {
			for (int j = 0; j < customerCounter[i].length; j++) {
				if (customerCounter[i][j]) {
					customersPerItem[i]++;
				}
			}
		}
		
		for (int i = 0; i < itemNames.length; i++) {
			if (customersPerItem[i] == 0) {
				System.out.println("No customers bought " + itemNames[i]);
			} else {
				System.out.println(customersPerItem[i] + " customers bought " + itemCounter[i] + " " + itemNames[i]);
			}
		}
		
		
	}
	
}
