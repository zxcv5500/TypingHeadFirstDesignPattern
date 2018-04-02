package headfirst.compound.decorator;

/**
 * @author zxcv5500
 * QuackCounter가 데코레이터 입니다.
 */
public class QuackCounter implements Quackable {			// 어댑터를 만들때와 마찬가지로 타겟 인터페이스를 구현해야 합니다.
	Quackable duck;								// 감싸고자 하는 객체의 레퍼런스를 저장하기 위한 인스턴스 변수가 있어야 되겠죠?
	static int numberOfQuacks;					// 모든 객체에서 꽥소리를 낸 회수를 전부 세야 하니까 정적변수를 써야 합니다.
	
	public QuackCounter(Quackable duck) {		
		this.duck = duck;
	}
	@Override
	public void quack() {						
		duck.quack();							//quack() 메소드가 호출되면 그 호출을 이 데코레이터 안에 들어있는 Quackable 객체에 위임합니다.
		numberOfQuacks++;						// 그리고 numberOfQuacks의 값을 1증가시킵니다.
	}
	
	public static int getQuacks() {
		return numberOfQuacks;					// 메소드가 하나 추가됩니다. 이 정적 메소드에서는 모든 Quackable에서 꽥 소리를 낸 회수를 리턴해 줍니다.
	}
	@Override
	public String toString() {
		
		return duck.toString();
	}
	

}
