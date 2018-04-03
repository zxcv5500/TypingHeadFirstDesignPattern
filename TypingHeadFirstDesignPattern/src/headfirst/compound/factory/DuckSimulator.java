package headfirst.compound.factory;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator.simulate(duckFactory);
	}
	
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();	
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall =    duckFactory.createDuckCall();
		Quackable rubberDuck =  duckFactory.createRubberDuck();
		Quackable gooseDuck =   new GooseAdapter(new Goose());
		
		System.out.println("\nDuck Simulator: With Abstract Factory");
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");		// 꽥학자를 위해서 꽥소리를 낸 회수를 출력하는 부분
		
	}

	void simulate(Quackable duck) {
		duck.quack();
	}

}
