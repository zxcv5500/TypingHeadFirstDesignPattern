package headfirst.strategy.designpuzzle;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("활과 화살을 사용합니다.");
	}

}
