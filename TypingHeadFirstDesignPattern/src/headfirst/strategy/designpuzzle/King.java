package headfirst.strategy.designpuzzle;

public class King extends Character {
	
	

	public King(WeaponBehavior weaponBehavior) {
		super(weaponBehavior);
	}

	@Override
	public void fight() {
		System.out.println("왕이 싸웁니다.");

	}

}
