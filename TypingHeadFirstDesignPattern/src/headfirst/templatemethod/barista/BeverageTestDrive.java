package headfirst.templatemethod.barista;

public class BeverageTestDrive {

	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		
		System.out.println("\n차를 만든다...");
		tea.prepareRecipe();
		
		System.out.println("\n커피를 만든다...");
		coffee.prepareRecipe();
		
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		
		System.out.println("\n티를 만든다.");
		teaHook.prepareRecipe();
		
		System.out.println("\n커피를 만든다.");
		coffeeHook.prepareRecipe();
	}

}
