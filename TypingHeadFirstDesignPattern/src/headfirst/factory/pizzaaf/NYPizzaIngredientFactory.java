package headfirst.factory.pizzaaf;

/**
 * @author sharpen
 * 뉴욕 원재료 공장 클래스입니다.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Garlic(, new Onion(), new Mushroom(), new RedPepper() };		// 야채의 경우는 야채들로 구성된 배열을 리턴하도록 합니다. 
																								//여기에서는 야채들을 만드는 부분을 직접 하드 코딩했습니다. 이부분도
		return veggies;																			//조금 더 복잡하게 만들 수 있겠지만, 팩토리 패턴을 학습하는 과정에서는 별로 필요할 것 같지 않아서 그냥 간단하게 했습니다.
	}

	@Override
	public Pepperoni createPepperoni() {
		
		return new SlicedPepperoni();			// 최고 품질의 슬라이스 페퍼로니, 페퍼로니는 시카고와 뉴욕에서 모두 같은 것을 씁니다. 여러분이 시카고 공장을 만들 때 꼭 같은 재료를 쓰도록 하세요.
	}

	@Override
	public Clams createClam() {
		
		return new FreshClams();				// 뉴욕은 바닷가에 있기 때문에 신선한 조개를 쉽게 구할 수 있습니다. 하지만 시카고는 내륙지방이라서 어쩔 수 없이 냉동조개를 쓰기로 했습니다.
	}

}
