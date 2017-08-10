package tasks.task_03.model.entity.tour_component;

import tasks.task_03.model.entity.Item;

public abstract class TourComponent implements Item {

    private int price;

    @Override
    public int getPrice() {
	return price;
    }
}
