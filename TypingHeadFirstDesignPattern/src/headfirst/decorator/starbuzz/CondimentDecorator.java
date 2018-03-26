package headfirst.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();			// 모든 첨가물 데코레이터에서 getDescription()메소드를 새로 구현하도록 만들 계획임. 그 이유는 잠시 후에...
}
