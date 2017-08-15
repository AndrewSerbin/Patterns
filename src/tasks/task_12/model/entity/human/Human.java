package tasks.task_12.model.entity.human;

import tasks.task_12.model.entity.state.State;

public class Human {

	private String name;

	private State state;

	public Human(String name) {
		this.name = name;
	}

	public void addState(State state) {
		this.state = state;
	}

	public void deleteState() {
		state = null;
	}

	public void make() {
		state.make(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
