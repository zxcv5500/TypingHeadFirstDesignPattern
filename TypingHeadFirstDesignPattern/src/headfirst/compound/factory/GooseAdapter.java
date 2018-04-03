package headfirst.compound.factory;

import headfirst.compound.factory.Quackable;

public class GooseAdapter implements Quackable {
	Goose goose;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
	
	@Override
	public void quack() {
		goose.honk();
	}

	@Override
	public String toString() {
		
		return "Goose pretending to be a Duck";
	}
	
	

}
