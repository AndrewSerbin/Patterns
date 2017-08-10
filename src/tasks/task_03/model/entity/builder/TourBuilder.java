package tasks.task_03.model.entity.builder;

import tasks.task_03.model.entity.Flight;
import tasks.task_03.model.entity.Tour;
import tasks.task_03.model.entity.Transfert;

public class TourBuilder {

    private Transfert transfert;

    private Flight flight;

    private boolean hotelReservation;

    private boolean insurance;

    public TourBuilder setTransfert(boolean transfertFromAirport, boolean transfertToAirport) {
	transfert = new Transfert(transfertFromAirport, transfertToAirport);
	return this;
    }

    public TourBuilder setFlight(boolean flightThere, boolean flightBack) {
	flight = new Flight(flightThere, flightBack);
	return this;
    }

    public TourBuilder setHotelReservation(boolean hotelReservation) {
	this.hotelReservation = hotelReservation;
	return this;
    }

    public TourBuilder setInsurance(boolean insurance) {
	this.insurance = insurance;
	return this;
    }

    public Tour build() {
	Tour tour = new Tour();
	tour.setFlight(flight);
	tour.setHotelReservation(hotelReservation);
	tour.setInsurance(insurance);
	tour.setTransfert(transfert);

	return tour;
    }
}
