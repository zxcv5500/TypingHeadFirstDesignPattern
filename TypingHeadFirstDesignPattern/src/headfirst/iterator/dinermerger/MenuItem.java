package headfirst.iterator.dinermerger;

public class MenuItem {
	String name;
	String description;
	boolean vegetarian;
	double price;
	public MenuItem(String name, String description, boolean vegeterian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegeterian;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public boolean isVegeterian() {
		return vegetarian;
	}
	public double getPrice() {
		return price;
	}
	
}
