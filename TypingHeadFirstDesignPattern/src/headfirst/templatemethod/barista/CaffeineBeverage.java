package headfirst.templatemethod.barista;

public abstract class CaffeineBeverage {
	
	final void prepareRecipe() {		// 자식 클래스에서 임의로 메소드를 건드리지 못하도록 final로 선언한다. point 1
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	//*	자식 클래스에서 반드시 세부사항을 구현해야 하는 abstract 메소드로 강제한다.
	abstract void brew();
		
	
	abstract void addCondiments();
	//*/
	
	
	private void boilWater() {
		System.out.println("물을 끓이는 중");		
	}

	private void pourInCup() {
		System.out.println("컵에 따르는 중");		
	}
}
