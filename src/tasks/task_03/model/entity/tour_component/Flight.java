package tasks.task_03.model.entity.tour_component;

public class Flight extends TourComponent {

    private boolean flightThere;

    private boolean flightBack;

    public Flight(boolean flightThere, boolean flightBack, int price) {
	super(price);
	this.flightThere = flightThere;
	this.flightBack = flightBack;
    }

    @Override
    public String toString() {
	return "Flight [flightThere=" + flightThere + ", flightBack=" + flightBack + "]";
    }

}
