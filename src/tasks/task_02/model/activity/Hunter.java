package tasks.task_02.model.activity;

import tasks.task_02.model.Environment;

public class Hunter implements Activity {

    @Override
    public void work() {
	System.out.println("Hunting");
    }

    @Override
    public boolean isAvailable(Environment environment) {
	return environment.equals(Environment.FOREST);
    }
}
