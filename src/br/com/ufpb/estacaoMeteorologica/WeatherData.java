package br.com.ufpb.estacaoMeteorologica;
import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}
	public void notifyObserver(){
		for(int x = 0; x < observers.size(); x++){
			Observer observer = (Observer)observers.get(x);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure){
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	

	

}
