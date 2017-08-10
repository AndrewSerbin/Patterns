package tasks.task_03.model.entity.tour_component;

import java.util.Date;

public class Hotel extends TourComponent {

    private Date dateForReservation;

    public Hotel(Date dateForReservation) {
	this.dateForReservation = dateForReservation;
    }

    @Override
    public String toString() {
	return "Hotel [dateForReservation=" + dateForReservation + "]";
    }
}
