package tasks.task_03.model.entity.tour_component;

public class Insurance extends TourComponent {

    private int sum;

    public Insurance(int sum) {
	this.sum = sum;
    }

    @Override
    public String toString() {
	return "Insurance [sum=" + sum + "]";
    }
}
