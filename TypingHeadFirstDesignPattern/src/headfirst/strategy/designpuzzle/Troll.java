package headfirst.strategy.designpuzzle;

public class Troll extends Character {

	public Troll(WeaponBehavior weaponBehavior) {
		super(weaponBehavior);
		characterName = "트롤";
	}

	@Override
	public void fight() {
		System.out.println(characterName + "이 싸웁니다.");
	}

}
