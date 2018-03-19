package headfirst.templatemethod.barista;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("차를 우려내는 중");		
	}

	@Override
	void addCondiments() {
		System.out.println("설탕과 커피를 추가하는 중");		
	}
	
}
