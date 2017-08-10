package tasks.task_03.model.entity;

public class Transfert {

    private boolean transfertFromAirport;

    private boolean transfertToAirport;

    public Transfert(boolean transfertFromAirport, boolean transfertToAirport) {
	this.transfertFromAirport = transfertFromAirport;
	this.transfertToAirport = transfertToAirport;
    }

    @Override
    public String toString() {
	return "Transfert [transfertFromAirport=" + transfertFromAirport + ", transfertToAirport="
		+ transfertToAirport + "]";
    }
}
