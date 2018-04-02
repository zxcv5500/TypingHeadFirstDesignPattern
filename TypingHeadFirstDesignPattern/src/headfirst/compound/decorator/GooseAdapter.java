package headfirst.compound.decorator;

import headfirst.compound.decorator.Quackable;

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
