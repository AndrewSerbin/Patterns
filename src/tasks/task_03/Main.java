package tasks.task_03;

import tasks.task_03.model.entity.Tour;
import tasks.task_03.model.entity.builder.TourBuilder;

class Main {

    public static void main(String[] args) {
	Tour tour = new TourBuilder()
		.setFlight(true, false)
		.setHotelReservation(false)
		.setInsurance(false)
		.setTransfert(true, true)
		.build();

	System.out.println(tour);
    }
}
