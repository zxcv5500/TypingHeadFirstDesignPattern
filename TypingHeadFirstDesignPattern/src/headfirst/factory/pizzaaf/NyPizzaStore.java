package headfirst.factory.pizzaaf;

public class NyPizzaStore extends PizzaStore {
	
	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		
		if (item.equals("cheese")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York Style Cheese Pizza");
			
		} else if (item.equals("veggie")) {
			pizza = new VeggiePizza(pizzaIngredientFactory);
			pizza.setName("New York Style Veggle Pizza");
			
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("New York Style Clam Pizza");
			
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(pizzaIngredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
					
		}
		
		return pizza;
		
	}

}
