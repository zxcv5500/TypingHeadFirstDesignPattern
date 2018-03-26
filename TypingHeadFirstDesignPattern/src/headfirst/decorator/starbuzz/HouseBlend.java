package headfirst.decorator.starbuzz;

public class HouseBlend extends Beverage {

	
	
	public HouseBlend() {
		description = "하우스 블랜드 커피";
	}

	@Override
	public double cost() {			// 하우스 블랜드 커피 입니다. description변수의 값을 "하우스 블렌드 커피"로 설정하고 cost() 메소드에서는 89센트를 리턴하게 만들면 끝!
		return 0.89;
	}

}
