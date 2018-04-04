package headfirst.compound.observer;

/**
 * @author zxcv5500
 * Observer 인터페이스에서는 꽥 소리를 낸 QuackObservable을 인자로 전달받는 update()메소드 하나만 있습니다.
 */
public interface Observer {
	public void update(QuackObservable duck);
}
