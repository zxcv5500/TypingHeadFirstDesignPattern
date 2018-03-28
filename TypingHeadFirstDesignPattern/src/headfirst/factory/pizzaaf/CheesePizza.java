package headfirst.factory.pizzaaf;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;
	
	
	/**
	 * @param pizzaIngredientFactory
	 * 이제 피자를 만들기 위해 원재료를 제공하는 공장이 필요합니다. 
	 * 따라서 각 피자 클래스에서는 생성자를 통해서 팩토리를 전달 받습니다.
	 * 이 팩토리는 pizzaIngredientFactory 인스턴스 변수에 저장합니다.
	 */
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {			
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
	}

}
