package headfirst.decorator.starbuzz;

public abstract class Beverage {
	String description = "제목없음";
	
	public String getDescription() {			// getDescription() 메소드는 이미 구현되어 있지만
		return description;
	}
	
	public abstract double cost();				// cost()는 서브클래스에서 구현해야 한다.
}
