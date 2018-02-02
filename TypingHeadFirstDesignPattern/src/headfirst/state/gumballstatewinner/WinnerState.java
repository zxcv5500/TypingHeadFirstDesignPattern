package headfirst.state.gumballstatewinner;

public class WinnerState implements State {
	GumballMachine gumballMachine;

	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("잠깐만, 우린 이미 너에게 껌볼을 주는 중이다");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("잠깐만, 우린 이미 너에게 껌볼을 주는 중이다");
	}

	@Override
	public void turnCrank() {
		System.out.println("다시 돌려봐. 넌 다른 껌볼을 받을 수 없다.");
	}

	@Override
	public void dispense() {
		System.out.println("축하드립니다.! 알맹이를 하나 더 받으실 수 있습니다. ");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount()== 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("더 이상 알맹이가 없습니다.");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	
	
	}

	
}
