package headfirst.state.gumballstate;

public class NoQuarterState implements State {								// State 인터페이스를 구현해야 합니다. 
	GumballMachine gumballMachine;

	
	

	public NoQuarterState(GumballMachine gumballMachine) {					// 생성자를 통해서 뽑기 기계에 대한 레퍼런스가 전달됩니다.
																			// 이 레퍼런스를 인스턴스 변수에 저장합니다.
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {											// 누군가가 동전을 집어넣으면 동전이 투입되었다는 메시지를 출력하고
																			// 기계의 상태를 HasQuarterState로 전환합니다.
		System.out.println("동전을 넣으셨습니다.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());		// 이 부분에 대해서는 잠시후 책에서 설명.
	}

	@Override
	public void ejectQuarter() {											// 동전을 넣지도 않은 상태에서 반환해 달라고 하면 안되겠죠?
		System.out.println("동전을 넣어주세요.");

	}

	@Override
	public void turnCrank() {												// 동전을 넣지 않은 상태에서 알맹이를 달라고 하면 안되죠
		System.out.println("동전을 넣어주세요.");
	}

	@Override
	public void dispense() {												// 돈이 들어오기 전에는 알맹이를 내줄 수 없습니다.
		System.out.println("동전을 넣어주세요.");
	}

}
