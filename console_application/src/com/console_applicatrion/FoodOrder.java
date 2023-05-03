package com.console_applicatrion;

import java.util.Scanner;

public class FoodOrder {

	// declare variables
	int frenchfries = 4;
	int chickenburger = 2;
	int nuggets = 5;
	int frosty = 3;
	int coke = 2;
	int orangejuice = 2;
	int ch;
	int quantity;
	static int total;
	String again;

	Scanner sc = new Scanner(System.in);
	// displaying menu
	public void displayMenu() {
		System.out.println("*************Welcome to Restro*************");
		System.out.println("===========================================");
		System.out.println("		1. French Fries			$4");
		System.out.println("		2. Chicken Burger		$2");
		System.out.println("		3. Nuggets			$5");
		System.out.println("		4. Frosty			$3");
		System.out.println("		5. Coke				$2");
		System.out.println("		6. Orange Juice			$2");
		System.out.println("		7. Exit					  ");
		System.out.println("===========================================");
		System.out.println("		What do you want order today?		");
	}

	// Generate Bill
	public void generateBill() {

		System.out.println();
		System.out.println("*************Thanks for ordering*************");
		System.out.println("**************Your Bill is : " + total + "***************");
	}

	// Create a method to order food
	public void order() {
		
		while (true)
		{
			System.out.println("Enter your Choice : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1: // French Fries
				System.out.println("You have Selected French Fries");
				System.out.println();
				System.out.println("Enter desired quantity");
				quantity = sc.nextInt();
				total = total + frenchfries * quantity;
				break;

			case 2: // Chicken Burger
				System.out.println("You have Selected Chicken Burger");
				System.out.println();
				System.out.println("Enter desired quantity");
				quantity = sc.nextInt();
				total = total + chickenburger * quantity;
				break;

			case 3: // Nuggets
				System.out.println("You have Selected Nuggets");
				System.out.println();
				System.out.println("Enter desired quantity");
				quantity = sc.nextInt();
				total = total + nuggets * quantity;
				break;

			case 4: // Frosty
				System.out.println("You have Selected Frosty");
				System.out.println();
				System.out.println("Enter desired quantity");
				quantity = sc.nextInt();
				total = total + frosty * quantity;
				break;

			case 5: // Coke
				System.out.println("You have Selected Coke");
				System.out.println();
				System.out.println("Enter desired quantity");
				quantity = sc.nextInt();
				total = total + coke * quantity;
				break;

			case 6: // Orange Juice
				System.out.println("You have Selected Ornage Juice");
				System.out.println();
				System.out.println("Enter desired quantity");
				quantity = sc.nextInt();
				total = total + orangejuice * quantity;
				break;

			case 7: // Exit
				System.exit(1);
				break;

			default:
				break;
			}
			System.out.println();
			System.out.print("Do you wish to order more (Y/N)");
			again = sc.next();
			if (again.equalsIgnoreCase("Y")) {
				order();
			}
			else if (again.equalsIgnoreCase("N")) {
				generateBill();
				System.exit(1);
			} else {
				System.out.println("Invalid");
			}
		}

	}

}
