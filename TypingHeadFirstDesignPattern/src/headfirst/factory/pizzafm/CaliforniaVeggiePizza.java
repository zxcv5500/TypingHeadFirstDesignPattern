package headfirst.factory.pizzafm;

public class CaliforniaVeggiePizza extends Pizza {
	public CaliforniaVeggiePizza() {
		name = "캘리포니아 채소 피자";
		dough = "캘리포니아 스타일 도우";
		sauce = "캘리포니아 소스";
		toppings.add("양파");
		toppings.add("마늘");
		toppings.add("가지");
	}
}
