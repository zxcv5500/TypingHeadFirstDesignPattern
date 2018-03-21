package headfirst.strategy.designpuzzle;

public class Troll extends Character {

	public Troll(WeaponBehavior weaponBehavior) {
		super(weaponBehavior);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight() {
		System.out.println("트롤이 싸웁니다.");
	}

}
