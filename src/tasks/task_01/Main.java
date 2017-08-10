package tasks.task_01;

import tasks.task_01.model.Human;
import tasks.task_01.model.activity.Activity;
import tasks.task_01.model.activity.Fisher;
import tasks.task_01.model.activity.Hunter;

class Main {

    public static void main(String[] args) {
	Human human = new Human();

	Activity fisher = new Fisher();
	human.setActivity(fisher);
	human.work();

	Activity hunter = new Hunter();
	human.setActivity(hunter);
	human.work();
    }
}
