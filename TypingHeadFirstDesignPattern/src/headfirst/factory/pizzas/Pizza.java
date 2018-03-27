package headfirst.factory.pizzas;

import java.util.ArrayList;

abstract public class Pizza {		// 우선 Pizza 추상 클래스를 만든 다음 이 클래스르 확장해서 구상 클래스를 만들겠습니다.
	//* 피자마다 이름, 반죽, 소스, 토핑이 필요합니다.
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	//*/
	
	public String getName() {
		return name;
	}
	
	void prepare() {
		System.out.println("Preparing " + name);
	}
	
	void bake() {
		System.out.println("Bakeing" + name);
	}
	
	void cut() {
		System.out.println("Cutting " + name);
	}
	
	void box() {
		System.out.println("Boxing" + name);
	}

	@Override
	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("----" + name + "---\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String) toppings.get(i) + "\n");
		}
		return display.toString();
	}
	
	
}
