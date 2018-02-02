package headfirst.strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}

}
