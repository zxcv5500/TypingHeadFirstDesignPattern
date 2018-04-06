package headfirst.compound.observer;

/**
 * @author zxcv5500
 * 유인용 오리 클래스 작성
 */
public class DecoyDuck implements Quackable {
	
	Observable observable;

	
	public DecoyDuck() {
		observable = new Observable(this);
	}
	
	
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
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
		
		return  "Decoy Duck";
	}
	
	

}
