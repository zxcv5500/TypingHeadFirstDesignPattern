package headfirst.templatemethod.barista;

public abstract class CaffineBeverageWithHook {
	
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (custommerWantsCondiments()) {
			addCondiments();
		}
	}
	

	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("물 끓이는 중");
	}
	
	void pourInCup() {
		System.out.println("컵에 따르는 중");
	}
	
	boolean custommerWantsCondiments() {
		return true;
	}
}
