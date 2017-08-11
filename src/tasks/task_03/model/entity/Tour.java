package tasks.task_03.model.entity;

import tasks.task_03.model.entity.tour_component.TourComponent;

public class Tour implements Item {

    private TourComponent transfert;

    private TourComponent flight;

    private TourComponent hotel;

    private TourComponent insurance;

    // private List<TourComponent> components; ???

    @Override
    public int getPrice() {
	int sum = 0;
	if (transfert != null) {
	    sum += transfert.getPrice();
	}
	if (flight != null) {
	    sum += flight.getPrice();
	}
	if (hotel != null) {
	    sum += hotel.getPrice();
	}
	if (insurance != null) {
	    sum += insurance.getPrice();
	}

	// for (TourComponent component : components) {
	// sum += component.getPrice();
	// }

	return sum;
    }

    public TourComponent getTransfert() {
	return transfert;
    }

    public void setTransfert(TourComponent transfert) {
	this.transfert = transfert;
    }

    public TourComponent getFlight() {
	return flight;
    }

    public void setFlight(TourComponent flight) {
	this.flight = flight;
    }

    public TourComponent getHotel() {
	return hotel;
    }

    public void setHotel(TourComponent hotel) {
	this.hotel = hotel;
    }

    public TourComponent getInsurance() {
	return insurance;
    }

    public void setInsurance(TourComponent insurance) {
	this.insurance = insurance;
    }

    @Override
    public String toString() {
	return "Tour [transfert=" + transfert + ", flight=" + flight + ", hotel=" + hotel + ", insurance=" + insurance + "]";
    }
}
