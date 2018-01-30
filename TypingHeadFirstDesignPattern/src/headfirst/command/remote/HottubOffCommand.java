package headfirst.command.remote;

public class HottubOffCommand implements Command {
	Hottub hottub;
	
	
	
	public HottubOffCommand(Hottub hottub) {
		super();
		this.hottub = hottub;
	}



	@Override
	public void execute() {
		hottub.cool();
		hottub.off();
	}

}
