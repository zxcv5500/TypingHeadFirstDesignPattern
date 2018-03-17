package headfirst.facade.hometheater;

public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	public HomeTheaterFacade(Amplifier amp, 
			Tuner tuner, 
			DvdPlayer dvd, 
			CdPlayer cd, 
			Projector projector,
			TheaterLights lights, 
			Screen screen, PopcornPopper popper) {
		
		super();
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	/**
	 * 영화 시청할 때 하는 일련의 작업을 매크로화해서 동작시킨다.
	 */
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
		
	}
	
	
	
	/**
	 * 영화 시청 후 끌 때 하는 일련의 동작들을 귀찮으니까 한곳에 몰빵해서 차례로 동작하게 한다.
	 */
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
	
	/**
	 * 라디오 들을 때 조작하는 일련의 작업들을 몰아둔다.
	 */
	public void listenToRadio(double frequency) {
		System.out.println("Tuning in the airwaves...");
		tuner.on();
		tuner.setFrequency(frequency);
		amp.on();
		amp.setVolume(5);
		amp.setTuner(tuner);
	}
	
	/**
	 * 라디오 다 듣고 나서 조작하는 일련의 작업들을 몰아둔다.
	 */
	public void endRadio() {
		System.out.println("Shutting down the tuner...");
		tuner.off();
		amp.off();
	}
	
}
