package headfirst.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
	float heatIndex = 0.0f;
	
	public HeatIndexDisplay(Observable observable) {
		observable.addObserver(this);
	}
	

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			float t = weatherData.getTemperature();
			float rh = weatherData.getHumidity();
			
			// heatIndex = (float) ... // TODO 기타 복잡한 수식 집에서 수정할 예정
			
			display();
		}
	}
	
	
	@Override
	public void display() {
		System.out.println("Heat index is " + heatIndex);
	}

}
