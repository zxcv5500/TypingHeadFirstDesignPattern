package headfirst.compound.observer;

/**
 * @author zxcv5500
 * 흰죽지오리 클래스
 */
public class RedHeadDuck implements Quackable {
	Observable observable;

	public RedHeadDuck() {
		observable = new Observable(RedHeadDuck.this);
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);		
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	

}
