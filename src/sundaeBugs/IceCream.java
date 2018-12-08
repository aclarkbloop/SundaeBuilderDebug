package sundaeBugs;

public class IceCream {
	private String flavor;
	private int scoops;
	private double price;
	
	public IceCream(String flavor, int scoops) {
		this.flavor = flavor;
		this.scoops = scoops;
		this.price = scoops * 1.5;
		
	}
	
	public String getFlavor() {
		return this.flavor;
	}
	
	public int getScoops() {
		return this.scoops;
	}
	
	public double getPrice() {
		return this.price;
	}
}
