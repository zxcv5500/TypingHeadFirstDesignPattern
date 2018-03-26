package headfirst.decorator.starbuzz;

public class Soy extends CondimentDecorator {
	
	Beverage beverage;
	
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", 두유";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.15 + beverage.cost();
	}

}
