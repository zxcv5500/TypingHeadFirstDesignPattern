package headfirst.state.gumballstate;

import javax.sound.sampled.SourceDataLine;

public class GumballMachine {
	/* 모든 상태 객체를 선언합니다. */
	State soldOutState;							// 매진상태
	State noQuarterState;						// 동전없음
	State hasQuarterState;						// 동전있음
	State soldState;							// 알맹이판매
	
	State state = soldOutState;					// 상태 인스턴스 변수 (State 형식)
	int count = 0;								// count 인스턴스 변수에는 알맹이 갯수가 저장됩니다.
												// 처음에는 비었으니까 0으로 설정합니다.
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

	
	/* 각 State 객체를 위한 게터 메소드를 비롯한 기타 메소드 */
	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}


	
	
	
}
