package headfirst.command.remote;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

		
	public StereoOnWithCDCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}


	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

}
