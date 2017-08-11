package tasks.task_03.model.entity.tour_component;

public class Transfert extends TourComponent {

    private boolean transfertFromAirport;

    private boolean transfertToAirport;

    public Transfert(boolean transfertFromAirport, boolean transfertToAirport, int price) {
	super(price);
	this.transfertFromAirport = transfertFromAirport;
	this.transfertToAirport = transfertToAirport;
    }

    @Override
    public String toString() {
	return "Transfert [transfertFromAirport=" + transfertFromAirport + ", transfertToAirport="
		+ transfertToAirport + "]";
    }
}
