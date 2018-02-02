package headfirst.state.gumballstatewinner;

import java.util.Random;

public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());			// 10%의 확률로 당첨 여부를 결정하는 난수 발생기를 추가함.
	GumballMachine gumballMachine;
	
	

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("동전은 한개만 넣어주세요.");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("동전은 반환됩니다.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("손잡이를 돌리셨습니다.");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {					// 당첨이 되었고 알맹이도 두개 이상이면 WinnerState로 전환합니다.
																				// 두 조건 중 하나라도 만족되지 않으면 그냥 전과 마찬가지로 SoldState로 넘어갑니다.
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}

	}

	@Override
	public void dispense() {
		System.out.println("알맹이가 나갈 수 없습니다.");
	}

}
