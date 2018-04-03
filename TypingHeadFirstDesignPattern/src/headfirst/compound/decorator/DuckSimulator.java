package headfirst.compound.decorator;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
	
	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());				//new QuackCounter(Quackable quackable) 데코레이터로 감쌉니다.	
		Quackable redheadDuck = new QuackCounter(new RedHeadDuck());
		Quackable duckCall =    new QuackCounter(new DuckCall());
		Quackable rubberDuck =  new QuackCounter(new RubberDuck());
		Quackable gooseDuck =   new GooseAdapter(new Goose());
		
		System.out.println("\nDuck Simulator: With Decorator");
		
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
