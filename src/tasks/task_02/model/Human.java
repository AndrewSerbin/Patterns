package tasks.task_02.model;

import java.util.ArrayList;
import java.util.List;

import tasks.task_02.model.activity.Activity;
import tasks.task_02.model.exception.EnvironmentNotFoundException;

public class Human {

    private List<Activity> activities;

    private List<Environment> environments;

    public Human() {
	activities = new ArrayList<>();
	environments = new ArrayList<>();
    }

    public void addActivity(Activity activity) throws EnvironmentNotFoundException {
	if (isActivityAvailable(activity)) {
	    activities.add(activity);
	} else {
	    throw new EnvironmentNotFoundException();
	}
    }

    private boolean isActivityAvailable(Activity activity) {
	for (Environment environment : environments) {
	    if (activity.isAvailable(environment)) {
		return true;
	    }
	}
	return false;
    }

    public void addEnvironment(Environment environment) {
	environments.add(environment);
    }

    public void work() {
	for (Activity activity : activities) {
	    activity.work();
	}
    }
}
