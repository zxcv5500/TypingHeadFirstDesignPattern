package headfirst.decorator.starbuzz;

public class Milk extends CondimentDecorator {
	Beverage beverage;
	
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", 밀크";
	}

	@Override
	public double cost() {
		
		return 0.10;
	}

}
