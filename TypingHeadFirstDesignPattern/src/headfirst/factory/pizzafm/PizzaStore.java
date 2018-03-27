package headfirst.factory.pizzafm;



public abstract class PizzaStore {
	
	abstract Pizza createPizza(String item);			// 팩토리 객체 대신 이 추상 메소드를 사용합니다. 실제 이 메소드의 구현은 서브클래스에서 하게 됩니다.
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza = createPizza(type);				// 팩토리 객체가 아닌 PizzaStore에 있는 createPizza를 호출하게 됩니다.
		
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
