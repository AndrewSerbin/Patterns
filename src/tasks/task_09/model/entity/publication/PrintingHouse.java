package tasks.task_09.model.entity.publication;

import java.util.ArrayList;
import java.util.List;

import tasks.task_09.model.entity.user.Observer;

public class PrintingHouse implements Observed {

    private Publication publication;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
	observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
	observers.remove(o);
    }

    public void setPublication(Publication publication) {
	this.publication = publication;

	notifyObserver();
    }

    @Override
    public void notifyObserver() {
	for (Observer observer : observers) {
	    observer.handleEvent(publication);
	}
    }
}
