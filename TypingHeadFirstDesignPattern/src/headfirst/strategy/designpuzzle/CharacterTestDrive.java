package headfirst.strategy.designpuzzle;

public class CharacterTestDrive {
	static Character character;
	
	public static void main(String[] args) {
		character = new King(new SwordBehavior());
		changeCharactor(character);
		
		
		System.out.println("------------클래스 변경--------");
		character = new Queen(new BowAndArrowBehavior());
		changeCharactor(character);		
		
	}
	
	public static void changeCharactor(Character character) {
		character.fight();
		character.performUseWeapon();
		
		character.setWeapon(new AxeBehavior());
		character.performUseWeapon();
		
	}

}
