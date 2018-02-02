package headfirst.state.gumballstatewinner;

public class SoldState implements State {
	GumballMachine gumballMachine;

	
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("기다려 주세요, 우리는 이미 너에게 껌을 주고 있어");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("미안, 넌 이미 기계를 돌렸어");
	}

	@Override
	public void turnCrank() {
		System.out.println("두번 돌려도 다른 껌볼을 받을 순 없어!!!");

	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("저런, 껌볼들이 떨어졌네.");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
