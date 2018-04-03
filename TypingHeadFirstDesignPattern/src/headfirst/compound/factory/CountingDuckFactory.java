package headfirst.compound.factory;

public abstract class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		
		return new QuackCounter(new RedHeadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		
		return new QuackCounter(new RubberDuck());
	}

}
