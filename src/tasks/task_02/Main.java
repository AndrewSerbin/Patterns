package tasks.task_02;

import tasks.task_02.model.Environment;
import tasks.task_02.model.Human;
import tasks.task_02.model.activity.Activity;
import tasks.task_02.model.activity.Hunter;
import tasks.task_02.model.exception.EnvironmentNotFoundException;

class Main {

    public static void main(String[] args) {
	Human human = new Human();

	Activity fisher = new Hunter();
	try {
	    human.addActivity(fisher);
	} catch (EnvironmentNotFoundException e) {
	    e.printStackTrace();
	}
	human.work();

	human.addEnvironment(Environment.FOREST);
	Activity hunter = new Hunter();
	try {
	    human.addActivity(hunter);
	} catch (EnvironmentNotFoundException e) {
	    e.printStackTrace();
	}
	human.work();
    }
}
