package headfirst.factory.pizzas;

import java.util.ArrayList;

abstract public class Pizza {		// 우선 Pizza 추상 클래스를 만든 다음 이 클래스르 확장해서 구상 클래스를 만들겠습니다.
	//* 피자마다 이름, 반죽, 소스, 토핑이 필요합니다.
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	//*/
	
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings : ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("    " + toppings.get(i));
		}
	}
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slice");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	@Override
	public String toString() {
		
		return name;
	}
	
	
}
