package headfirst.strategy.designpuzzle;

public class Queen extends Character {
	
	
	
	public Queen(WeaponBehavior weaponBehavior) {
		super(weaponBehavior);
		characterName = "여왕";
	}

	@Override
	public void fight() {
		System.out.printf("%s이 싸웁니다.", characterName);
	}

}
