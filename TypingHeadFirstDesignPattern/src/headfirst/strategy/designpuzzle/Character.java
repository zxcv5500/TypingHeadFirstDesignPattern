package headfirst.strategy.designpuzzle;

public abstract class Character {
	
	WeaponBehavior weaponBehavior;
	
	public Character(WeaponBehavior weaponBehavior) {
		super();
		this.weaponBehavior = weaponBehavior;
	}


	public void setWeapon(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	
	
	public void performUseWeapon() {
		weaponBehavior.useWeapon();
	}
	
	public abstract void fight();

}
