package headfirst.factory.pizzafm;

/**
 * @author sharpen
 * p175
 * 연필을 깎으며에 나오는 
 * 심하게 의존적인 pizzaStore 코드 예제입니다.
 */
public class DependentPizzaStore {
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NyStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NyStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NyStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NyStylePepperoniPizza();
			}
		} else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
