package headfirst.compound.observer;

import headfirst.compound.observer.Quackable;

public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
	
	@Override
	public void quack() {
		goose.honk();
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
		
		return "Goose pretending to be a Duck";
	}

}
