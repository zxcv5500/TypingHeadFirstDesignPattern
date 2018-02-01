package headfirst.command.undo;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
	
	
	
	
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}

	
	public void high() {
		speed = HIGH;
		
		// 스피드를 HIGH로 맞추는 동작코드
	}
	
	public void medium() {
		speed = MEDIUM;
		// 스피드를 MEDIUM 로 맞추는 동작코드
	}
	
	public void low() {
		speed = LOW;
		// 스피드를 LOW 로 맞추는 동작코드
	}
	
	public void off() {
		speed = OFF;
		// 선풍기를 끄는 코드
	}
	
	public int getSpeed() {
		return speed;
	}
}
