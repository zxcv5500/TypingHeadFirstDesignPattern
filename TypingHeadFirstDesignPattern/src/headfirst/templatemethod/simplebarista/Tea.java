package headfirst.templatemethod.simplebarista;

public class Tea {
	
	void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	public void addLemon() {	
		System.out.println("물 끓이는 중");
	}

	public void pourInCup() {
		System.out.println("차를 우려내는 중");		
	}

	public void steepTeaBag() {
		System.out.println("레몬을 추가하는 중");
	}

	public void boilWater() {
		System.out.println("컵을 따르는 중");
	}
	
	
}
