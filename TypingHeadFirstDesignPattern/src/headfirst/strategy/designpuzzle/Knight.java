package headfirst.strategy.designpuzzle;

public class Knight extends Character {

	public Knight(WeaponBehavior weaponBehavior) {
		super(weaponBehavior);
		characterName = "기사";
	}

	@Override
	public void fight() {
		System.out.println("기사가 싸웁니다.");
	}

}
