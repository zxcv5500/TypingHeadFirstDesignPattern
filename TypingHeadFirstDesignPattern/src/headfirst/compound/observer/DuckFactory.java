package headfirst.compound.observer;

/**
 * @author zxcv5500
 * DuckFactory는 추상 팩토리를 확장해 만듭니다.
 */
public class DuckFactory extends AbstractDuckFactory {

	//* 각 메소드에서는 제품을 생산합니다. 
	// 전부 일종의 Quackable 객체를 만들죠. 
	// 시뮬레이터에서는 실제 어떤 제품이 만들어 지는지 알수 없습니다. 
	// 그냥 Quackable가 리턴 된다는 것만 알 수 있죠.
	@Override
	public Quackable createMallardDuck() {
		
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		
		return new RedHeadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		
		return new RubberDuck();
	}
	//*/
}
