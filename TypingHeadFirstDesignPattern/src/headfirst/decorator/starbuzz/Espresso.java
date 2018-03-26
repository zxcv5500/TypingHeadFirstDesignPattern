package headfirst.decorator.starbuzz;

public class Espresso extends Beverage {		// Beverage 클래스를 확장합니다.
	
	public Espresso() {
		description = "에스프레소";				// 클래스 생성자 부분에서 description 변수의 값을 설정합니다. description이라는 인스턴스 변수는 Beverage로부터 상속 받은 거죠?
	}

	@Override
	public double cost() {						
		return 1.99;							// 마지막으로 에스프레소 가격을 계산해야 합니다. 이 클래스에서는 첨가물 가격을더하는 건 걱정할 필요가 없습니다.
	}

}
