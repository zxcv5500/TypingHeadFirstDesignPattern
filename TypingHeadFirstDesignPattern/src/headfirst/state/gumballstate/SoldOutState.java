package headfirst.state.gumballstate;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("동전을 넣을 수 없습니다. 매진 상태입니다.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("동전을 뺄 수 없습니다. 아직 동전을 넣을 수 없는 상태이기 때문입니다.");
	}

	@Override
	public void turnCrank() {
		System.out.println("당신이 레버를 돌렸다. 그러나 거기엔 껌볼이 없다.");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	@Override
	public String toString() {
		
		return "sold out";
	}
	
	

}
