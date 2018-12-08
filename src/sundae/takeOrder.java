package sundae;

import java.util.Scanner;

public class takeOrder {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to the ice cream shop! How many customers are in your group?");
		int numCustomers = s.nextInt();
		double totalPrice = 0.0;
		int totalTime = 0;
		
		for (int i = 1; i < numCustomers + 1 ; i++) {
			System.out.println("Customer " + i + ", pick a flavor of ice cream.");
			String flavor = s.next();
			
			System.out.println("Ok, how many scoops would you like?");
			int numScoops = s.nextInt();
			
			IceCream iceCream = new IceCream(flavor, numScoops);
			
			
			
			System.out.println("Now, how many toppings would you like? Choose up to 5!");
			Topping[] toppings = makeToppingArray(s, s.nextInt());
			
			SundaeBuilderImpl build = new SundaeBuilderImpl(iceCream, toppings);
			
			double price = build.calculatePrice(toppings);
			double waitTime = build.calculateTime();
			// bug here where incrementing is incorrect
			totalPrice += price;
			totalTime += waitTime;
			
			System.out.println("Your total is $" + price + " and your wait time is " + waitTime );
		}
		
		System.out.println("The total cost for your group was $" + totalPrice + " and your total"
				+ " wait time was " + totalTime + " minutes.");
		
	
	}
	
	public static Topping[] makeToppingArray(Scanner s, int length) throws Exception {
		// add a bug here with the direction of the equality sign
		if (length > 5 || length < 0) {
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
