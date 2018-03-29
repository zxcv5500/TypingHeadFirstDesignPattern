package headfirst.factory.pizzafm;

public class NyPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		
		if (item.equals("cheese")) {
			return new NyStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NyStyleVeggiePizza();
		} else if (item.equals("pepperoni")) {
			return new NyStylePepperoniPizza();
		} else if (item.equals("clam")) {
			return new NyStyleClamPizza();
		} else {
			return null;
		}
	}

}
