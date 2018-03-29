package headfirst.factory.pizzaaf;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
		if ("cheese".equals(item)) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		}
		
		if ("veggie".equals(item)) {
			pizza = new VeggiePizza(pizzaIngredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
		}
		
		if ("clam".equals(item)) {
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
		}
		
		if ("pepperoni".equals(item)) {
			pizza = new PepperoniPizza(pizzaIngredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
		}
		
		
		return pizza;
	}

}
