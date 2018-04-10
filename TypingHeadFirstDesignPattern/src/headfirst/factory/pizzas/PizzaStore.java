package headfirst.factory.pizzas;

public class PizzaStore {
	SimplePizzaFactory factory;								// PizzaStore에 SimplePizzaFactory에 대한 레퍼런스를 저장합니다.

	public PizzaStore(SimplePizzaFactory factory) {			// PizzaStore의 생성자에 팩토리 객체가 전달됩니다.
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
