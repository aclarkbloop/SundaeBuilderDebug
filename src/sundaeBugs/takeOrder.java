package sundaeBugs;

import java.util.Scanner;

public class takeOrder {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		// Scanner s reads in user input from the console.		
		System.out.println("Welcome to the ice cream shop! How many customers are in your group?");
		int numCustomers = s.nextInt();
		double totalPrice = 0.0;
		int totalTime = 0;
		
		 /* loop for the number of customers specified by the user and ask each customer to pick a flavor
                 of icecream and the number of scoops */	

		for (int i = 1; i < s.nextInt(); i++) {
			System.out.println("Customer " + i + ", pick a flavor of ice cream.");
			String flavor = s.next();
			
			System.out.println("Ok, how many scoops would you like?");
			int numScoops = s.nextInt();
			
			IceCream iceCream = new IceCream(flavor, numScoops);
			
			/* ask each customer how many toppings and call makeToppingArray method
                        with the number of toppings specified */			
			
			
			System.out.println("Now, how many toppings would you like? Choose up to 5!");
			Topping[] toppings = makeToppingArray(s, s.nextInt());
			// create new SundaeBuilerImpl with the topping array returned by makeToppingArray
			SundaeBuilderImpl build = new SundaeBuilderImpl(iceCream, toppings);
			
			double price = build.calculatePrice(toppings);
			int waitTime = build.calculateTime();
			totalPrice = price;
			totalTime = waitTime;
			// print total price and wait time for each customer
			System.out.println("Your total is $" + price + " and your wait time is " + waitTime );
		}
		// print total price and wait time for the entire customer group
		System.out.println("The total cost for your group was $" + totalPrice + " and your total"
				+ " wait time was " + totalTime + " minutes.");
		
	
	}
	
	public static Topping[] makeToppingArray(Scanner s, int length) throws Exception {
		if (length > 5 || length > 0) {
			throw new Exception("That's too many toppings! Please choose between 0-5 toppings");
		} 
		Topping[] toppings = new Topping[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Please list topping " + (i+1) + ":" );
			toppings[i] = new Topping(s.next());
		}
		
		return toppings;
	}
}
