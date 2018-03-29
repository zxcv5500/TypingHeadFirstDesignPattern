package headfirst.factory.pizzaaf;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NyPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");

	}

}
