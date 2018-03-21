package headfirst.observer.weatherStation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
    private Subject weatherData;
    
    
    
	public CurrentConditionsDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(CurrentConditionsDisplay.this);
	}


	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degress and " + humidity + " % humidity");		
	}
}
