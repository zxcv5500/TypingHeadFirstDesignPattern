package headfirst.compound.ducks;

/**
 * @author zxcv5500
 * 오리 호출기 클래스. 소리를 내긴 하지만 실물 오리랑은 조금 다른 소리를 냅니다.
 */
public class DuckCall implements Quackable {

	@Override
	public void quack() {
		System.out.println("Kwak");
	}

}
