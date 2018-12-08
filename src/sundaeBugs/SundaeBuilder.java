package sundaeBugs;

public interface SundaeBuilder {
	double calculatePrice();
	IceCream getIceCream();
	Topping[] getToppings();
	int calculateTime();
}
