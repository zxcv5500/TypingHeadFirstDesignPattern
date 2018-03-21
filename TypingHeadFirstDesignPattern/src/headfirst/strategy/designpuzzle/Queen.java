package headfirst.strategy.designpuzzle;

public class Queen extends Character {
	
	
	
	public Queen(WeaponBehavior weaponBehavior) {
		super(weaponBehavior);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight() {
		System.out.println("여왕이 싸웁니다.");
	}

}
