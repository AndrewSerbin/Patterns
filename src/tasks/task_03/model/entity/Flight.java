package tasks.task_03.model.entity;

public class Flight {

    private boolean flightThere;

    private boolean flightBack;

    public Flight(boolean flightThere, boolean flightBack) {
	this.flightThere = flightThere;
	this.flightBack = flightBack;
    }

    @Override
    public String toString() {
	return "Flight [flightThere=" + flightThere + ", flightBack=" + flightBack + "]";
    }

}
