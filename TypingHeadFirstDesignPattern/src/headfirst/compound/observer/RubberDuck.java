package headfirst.compound.observer;

/**
 * @author zxcv5500
 * 러버덕은 삑삑 소리를 냅니다.
 */
public class RubberDuck implements Quackable {
	Observable observable;
	
	public RubberDuck() {
		observable = new Observable(RubberDuck.this);
	}
	
	@Override
	public void quack() {
		System.out.println("Squeak");
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

	@Override
	public String toString() {
		
		return "Redhead Duck";
	}
	
	

}
