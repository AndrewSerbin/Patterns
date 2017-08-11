package tasks.task_03;

import java.util.Date;

import tasks.task_03.model.entity.Item;
import tasks.task_03.model.entity.builder.TourBuilder;

class Main {

    public static void main(String[] args) {
	Item tour = new TourBuilder()
		.setFlight(true, false, 2000)
		.setHotel(new Date(), 1000)
		.setInsurance(1000, 2000)
		.setTransfert(true, true, 500)
		.build();

	System.out.println(tour);
	System.out.println(tour.getPrice());
    }
}
