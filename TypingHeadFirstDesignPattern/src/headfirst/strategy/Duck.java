package headfirst.strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior gb) {
		quackBehavior = gb;
	}
	
	
	public abstract void display();				// 자손 클래스들은 무조건 구현해야하는 abstract 메소드
	
	
	/* interface로 변화되는 부분을 추상화 해낸 interface에 행동을 위임하는 메소드들 */
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	}
	

	
	
}
