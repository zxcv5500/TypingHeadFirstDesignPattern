package headfirst.command.remote;

public class CeilingFanOnCommand implements Command {

	CeilingFan ceilingFan;
	
	
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}



	@Override
	public void execute() {
		ceilingFan.high();
	}

}
