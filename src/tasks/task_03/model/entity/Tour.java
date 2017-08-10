package tasks.task_03.model.entity;

public class Tour {

    private Transfert transfert;

    private Flight flight;

    private boolean hotelReservation;

    private boolean insurance;

    public Transfert getTransfert() {
	return transfert;
    }

    public void setTransfert(Transfert transfert) {
	this.transfert = transfert;
    }

    public Flight getFlight() {
	return flight;
    }

    public void setFlight(Flight flight) {
	this.flight = flight;
    }

    public boolean isHotelReservation() {
	return hotelReservation;
    }

    public void setHotelReservation(boolean hotelReservation) {
	this.hotelReservation = hotelReservation;
    }

    public boolean isInsurance() {
	return insurance;
    }

    public void setInsurance(boolean insurance) {
	this.insurance = insurance;
    }

    @Override
    public String toString() {
	return "Tour [transfert=" + transfert + ", flight=" + flight + ", hotelReservation="
		+ hotelReservation + ", insurance=" + insurance + "]";
    }

}
