package headfirst.strategy.designpuzzle;

public abstract class Character {
	
	WeaponBehavior weaponBehavior;
	String characterName = "캐릭터 지정안됨";
	
	public Character(WeaponBehavior weaponBehavior) {
		super();
		this.weaponBehavior = weaponBehavior;
	}


	public void setWeapon(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	
	
	public void performUseWeapon() {
		weaponBehavior.useWeapon(characterName);
	}
	
	public abstract void fight();

}
