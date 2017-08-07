package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class MeteoStation implements Observed {

    int temperature;
    int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setMeasurements(int temperature, int presesure) {
	this.temperature = temperature;
	this.pressure = presesure;

	notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
	observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
	observers.remove(o);
    }

    @Override
    public void notifyObserver() {
	for (Observer observer : observers) {
	    observer.handleEvent(temperature, pressure);
	}
    }
}
