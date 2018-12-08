package sundae;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class sundaeTests {

	@Test
	void testToppingException() {
		Topping[] toppings = {new Topping("Sprinkles"), new Topping("Fudge")};
		IceCream iceCream = new IceCream("Chocolate", 3);
		try {
			SundaeBuilderImpl sundae = new SundaeBuilderImpl(iceCream, toppings);
		} catch (Exception e) {
		}
	}
	
	void testIceCream() {
		IceCream iceCream = new IceCream("Vanilla", 3);
		assertEquals(3, iceCream.getScoops());
	}

}
