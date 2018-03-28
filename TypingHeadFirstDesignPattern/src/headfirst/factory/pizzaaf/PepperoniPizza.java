package headfirst.factory.pizzaaf;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	@Override
	void prepare() {
		System.out.println("Prepareing " + name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
		veggies = pizzaIngredientFactory.createVeggies();
		pepperoni = pizzaIngredientFactory.createPepperoni();
	}

}
