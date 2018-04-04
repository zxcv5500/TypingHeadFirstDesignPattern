package headfirst.compound.observer;

/**
 * @author zxcv5500
 * 표준적인 물오리 클래스
 */
public class MallardDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
