package headfirst.compound.factory;

public class GooseFactory extends AbstractGooseFactory {

	@Override
	public Goose createGoose() {
		
		return new Goose();
	}
	
}
