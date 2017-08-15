package tasks.task_12;

import tasks.task_12.model.entity.human.Human;
import tasks.task_12.model.entity.state.DetectiveWriterState;
import tasks.task_12.model.entity.state.State;

public class Main {

	public static void main(String[] args) {
		Human human = new Human("John");

		State state = new DetectiveWriterState();

		human.addState(state);

		human.make();

		human.deleteState();
	}
}
