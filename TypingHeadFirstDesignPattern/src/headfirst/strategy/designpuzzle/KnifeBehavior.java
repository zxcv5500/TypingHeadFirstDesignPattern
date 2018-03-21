package headfirst.strategy.designpuzzle;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon(String name) {
		System.out.println(name + "이 나이프를 휘두릅니다.");
	}

}
