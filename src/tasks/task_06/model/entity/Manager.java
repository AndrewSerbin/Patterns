package tasks.task_06.model.entity;

public class Manager implements Worker {

    @Override
    public void work() {
	System.out.println("Manager works");
    }
}
