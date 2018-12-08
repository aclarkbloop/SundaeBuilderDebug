package sundae;

public interface SundaeBuilder {
	double calculatePrice();
	IceCream getIceCream();
	Topping[] getToppings();
	double calculateTime();
}
