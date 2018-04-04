package headfirst.compound.observer;

public class GooseFactory extends AbstractGooseFactory {

	@Override
	public Goose createGoose() {
		
		return new Goose();
	}
	
}
