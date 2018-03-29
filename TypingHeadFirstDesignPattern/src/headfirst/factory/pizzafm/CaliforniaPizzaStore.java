package headfirst.factory.pizzafm;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		
		if ("cheese".equals(item)) {
			return new CaliforniaCheesePizza();
		} else if ("clam".equals(item)) {
			return new CaliforniaClamPizza();
		} else if ("veggie".equals(item)) {
			return new CaliforniaVeggiePizza();
		} else if ("pepperoni".equals(item)) {
			return new CaliforniaPepperoniPizza();
		} else return null;
		
	}

}
