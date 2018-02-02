package headfirst.state.gumballstatewinner;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("동전을 넣지 마세요! 그 기계는 매진 되었습니다.");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("동전을 뺄 수 없습니다. 당신은 아직 동전을 꽂은 적이 없습니다.");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("당신이 꼭지를 돌렸지만, 거기에는 껌이 없습니다. 매진!");		
	}

	@Override
	public void dispense() {
		System.out.println("껌이 없어서 안나옵니다.");		
	}

	@Override
	public String toString() {
		
		return "sold out";
	}
	
	

}
