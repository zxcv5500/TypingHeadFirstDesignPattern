package headfirst.adapter.ducks;

public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();					// duck 객체를 생성합니다.
		
		WildTurkey turkey = new WildTurkey();					// Turkey도 만들어야 되겠죠.
		Duck turkeyAdapter = new TurkeyAdapter(turkey);			// Turkey는 TurkeyAdapter로 감싸서 Duck처럼 보이도록 만듭니다.
		
		System.out.println("The Turkey says...");				// Turkey 자체를 테스트합니다. 골골 거리는 소리도 내게 하고 날게도 해봅시다.
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");				// Duck 객체를 전달해야 되는 testDuck() 메소드를 호출해서 Duck객체를 테스트합니다.
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");		
		testDuck(turkeyAdapter);								// 가장 중요한 부분 : 오리 대신 칠면조를 넘겨 봅시다.	
	}
	
	static void testDuck(Duck duck) {							// testDuck() 메소드 : 오리 객체를 받아서 quack()과 fly() 메소드를 호출합니다.
		duck.quack();
		duck.fly();
	}

}
