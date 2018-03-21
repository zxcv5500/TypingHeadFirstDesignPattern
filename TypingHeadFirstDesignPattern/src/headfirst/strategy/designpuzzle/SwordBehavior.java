package headfirst.strategy.designpuzzle;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon(String name) {
		System.out.println(name + "이 검을 휘두릅니다");
	}

}
