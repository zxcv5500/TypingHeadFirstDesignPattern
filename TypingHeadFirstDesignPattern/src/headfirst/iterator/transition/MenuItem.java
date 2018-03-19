package headfirst.iterator.transition;

public class MenuItem {
	String name;
	String description;
	boolean vegetaraian;
	double price;
	
	public MenuItem(String name, 
			String description,
			boolean vegetarian,
			double price)
	{
		this.name = name;
		this.description = description;
		this.vegetaraian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetaraian() {
		return vegetaraian;
	}

	public double getPrice() {
		return price;
	}
	
	
}
