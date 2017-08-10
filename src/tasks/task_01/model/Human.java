package tasks.task_01.model;

import tasks.task_01.model.activity.Activity;

public class Human {

    private Activity activity;

    public void setActivity(Activity activity) {
	this.activity = activity;
    }

    public void work() {
	activity.work();
    }
}
