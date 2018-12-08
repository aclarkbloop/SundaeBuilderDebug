package sundae;

public class SundaeBuilderImpl {
	double price = 0.0;
	IceCream iceCream;
	Topping[] toppings;
	int waitTime = 0;
	int numToppings = 0;
	
	
	
	public SundaeBuilderImpl(IceCream iceCream, Topping[] toppings) {
		this.iceCream = iceCream;
		this.toppings = toppings;
	}
	
	
	public IceCream getIceCream() {
		return this.iceCream;
	}
	
	public Topping[] getToppings() {
		return this.toppings;
	}

	
	/* acts as a setter for price
	 * price is calculated as the base price of the ice cream plus 
	 * 0.50 cents per topping. 
	 */
	
	public double calculatePrice(Topping[] toppings) {
		double toppingsTotal = 0;
		for (int i = 0; i < toppings.length; i++) {
			toppingsTotal += 0.5;
		}
		price = this.iceCream.getPrice() + toppingsTotal; 
		return price;
	}
	
	// setter for waitTime (base wait time is 2 minutes the add 1 minute per topping)
	public double calculateTime() {
		waitTime = 2 + (1 * numToppings);
		return this.waitTime;
	}

}
