package headfirst.compound.composite;

/**
 * @author zxcv5500
 * 유인용 오리 클래스 작성
 */
public class DecoyDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
