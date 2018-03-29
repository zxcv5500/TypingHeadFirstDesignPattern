package headfirst.factory.pizzas;

public class PizzaStore {
	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		super();
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = factory.createPizza(type);				// 피자를 생성하는 부분만 바뀐다. 바뀌는 부분은 캡슐화 한다.
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	
}
