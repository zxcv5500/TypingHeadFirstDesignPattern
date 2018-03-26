package headfirst.observer.weatherStation;

public class HeatIndexDisplay implements Observer, DisplayElement {
	float heatIndex = 0.0f;
	private WeatherData weatherData;
	
	
	

	public HeatIndexDisplay(WeatherData weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
//		weatherData.registerObserver(HeatIndexDisplay.this);
	}
	
	

	@Override
	public void update(float t, float rh, float pressure) {
		heatIndex = computeHeatIndex(t, rh);
		display();
	}
	
	private float computeHeatIndex(float t, float rh) {
		float index = 1.1f; 		// TODO 원래는 복잡한 수식이 들어간다. 집에서 수정 예정 
		return index;
	}

	@Override
	public void display() {
		System.out.println("Heat index is " + heatIndex);
	}


}
