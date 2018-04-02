package headfirst.compound.decorator;

/**
 * @author zxcv5500
 * 러버덕은 삑삑 소리를 냅니다.
 */
public class RubberDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Squeak");

	}

}
