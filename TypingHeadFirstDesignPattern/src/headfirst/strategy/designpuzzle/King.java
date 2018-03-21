package headfirst.strategy.designpuzzle;

public class King extends Character {
	
	public King(WeaponBehavior weaponBehavior) {
		super(weaponBehavior);
		characterName = "왕";
	}

	@Override
	public void fight() {
		System.out.println(characterName + "이 싸웁니다.");

	}

}
