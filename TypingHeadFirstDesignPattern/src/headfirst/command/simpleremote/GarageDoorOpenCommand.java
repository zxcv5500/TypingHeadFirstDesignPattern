package headfirst.command.simpleremote;

public class GarageDoorOpenCommand implements Command {
	
	GarageDoor garageDoor;
	
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}


	@Override
	public void execute() {
		garageDoor.up();		// 차고 문을 여는 기능을 GarageDoorOpenCommand에 위임해서 실행한다.
	}
	
}
