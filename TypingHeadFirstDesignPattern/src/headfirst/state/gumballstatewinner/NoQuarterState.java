package headfirst.state.gumballstatewinner;

/**
 * @author sharpen
 * 동전없음 상태 class 작성
 */
public class NoQuarterState implements State {
	GumballMachine gumballMachine;

	
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("니가 동전을 넣었다.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("끼워넣지 않았던 동전을 꺼낼 수는 없습니다.");
	}

	@Override
	public void turnCrank() {
		System.out.println("레버를 돌렸다. 하지만 거기엔 동전이 없다.");
	}

	@Override
	public void dispense() {
		System.out.println("넌 처음에 동전을 넣을 필요가 있다.");
	}

	@Override
	public String toString() {
		
		return "waiting for quarter";
	}
	
	

}
