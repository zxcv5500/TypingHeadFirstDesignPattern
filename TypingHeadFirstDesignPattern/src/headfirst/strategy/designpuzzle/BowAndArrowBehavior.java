package headfirst.strategy.designpuzzle;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon(String name) {
		System.out.println(name + "이 활과 화살을 사용합니다.");
	}

}
