package headfirst.factory.pizzaaf;

/**
 * @author sharpen
 * 피자재료 공장 클래스입니다.
 */
public interface PizzaIngredientFactory {
	//* 인터페이스에 각 재료별 생성 메소드를 정의합니다.
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
	//*/
	// 여러가지 새로운 클래스들이 도입되었습니다. 재료마다 하나씩 클래스를 만들어야 합니다.
	// ----- 모든 팩토리 인스턴스에서 공통적으로 사용하는 부분이 있다면 인터페이스가 아닌 추상 클래스로 만들어도 됩니다.----
	
}
