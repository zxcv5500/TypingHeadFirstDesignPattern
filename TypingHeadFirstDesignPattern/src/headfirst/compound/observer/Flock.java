package headfirst.compound.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zxcv5500
 * 복합 객체(composite)와 잎 원소에서 똑같은 인터페이스를 구현해야 된다는 것 기억나시나요? 
 * 여기서는 Quackable이 잎 원소가 됩니다.
 */
public class Flock implements Quackable {
	ArrayList ducks = new ArrayList<>();				// Flock에 속하는 Quackable 객체들은 ArrayList에 저장합니다.
	
	public void add(Quackable duck) {				// Flock에 Quackable을 추가하기 위한 메소드
		ducks.add(duck);
	}
	
	
	/* (non-Javadoc)
	 * @see headfirst.compound.composite.Quackable#quack()
	 * quack() 메소드. Flock도 결국은 Quackable입니다. Flock에 들어있는
	 * quack() 메소드에서는 그 Flock 안에 들어있는 모든 오리들을 챙겨야 합니다.
	 * ArrayList에 대해서 순환문을 돌리면서 각 원소의 quack()메소드를 호출합니다.
	 */
	@Override
	public void quack() {		
		Iterator iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable) iterator.next();
			duck.quack();
		}	
	}


	@Override
	public void registerObserver(Observer observer) {
		Iterator iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable) iterator.next();
			duck.registerObserver(observer);
		}
		
	}


	@Override
	public void notifyObservers() {			}


	@Override
	public String toString() {
		
		return "Flock of Ducks";
	}
	
	

}
