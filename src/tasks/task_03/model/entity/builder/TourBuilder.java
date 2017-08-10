package tasks.task_03.model.entity.builder;

import java.util.Date;

import tasks.task_03.model.entity.Tour;
import tasks.task_03.model.entity.tour_component.Flight;
import tasks.task_03.model.entity.tour_component.Hotel;
import tasks.task_03.model.entity.tour_component.Insurance;
import tasks.task_03.model.entity.tour_component.TourComponent;
import tasks.task_03.model.entity.tour_component.Transfert;

public class TourBuilder {

    private TourComponent transfert;

    private TourComponent flight;

    private TourComponent hotel;

    private TourComponent insurance;

    public TourBuilder setTransfert(boolean transfertFromAirport, boolean transfertToAirport) {
	transfert = new Transfert(transfertFromAirport, transfertToAirport);
	return this;
    }

    public TourBuilder setFlight(boolean flightThere, boolean flightBack) {
	flight = new Flight(flightThere, flightBack);
	return this;
    }

    public TourBuilder setHotel(Date dateForReservation) {
	hotel = new Hotel(dateForReservation);
	return this;
    }

    public TourBuilder setInsurance(int sum) {
	insurance = new Insurance(sum);
	return this;
    }

    public Tour build() {
	Tour tour = new Tour();
	tour.setFlight(flight);
	tour.setHotel(hotel);
	tour.setInsurance(insurance);
	tour.setTransfert(transfert);

	return tour;
    }
}
