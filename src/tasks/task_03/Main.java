package tasks.task_03;

import java.util.Date;

import tasks.task_03.model.entity.Tour;
import tasks.task_03.model.entity.builder.TourBuilder;

class Main {

    public static void main(String[] args) {
	Tour tour = new TourBuilder()
		.setFlight(true, false)
		.setHotel(new Date())
		.setInsurance(1000)
		.setTransfert(true, true)
		.build();

	System.out.println(tour);
    }
}
