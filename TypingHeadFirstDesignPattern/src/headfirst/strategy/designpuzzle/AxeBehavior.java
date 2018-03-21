package headfirst.strategy.designpuzzle;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon(String name) {
		System.out.println(name+ "이 도끼를 휘두릅니다.");
	}

}
