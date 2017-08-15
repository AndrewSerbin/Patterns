package tasks.task_12.model.entity.role;

import tasks.task_12.model.entity.human.Human;
import tasks.task_12.model.entity.writing_accessory.WritingAccessory;

public abstract class Writer {

	private WritingAccessory writingAccessory;

	private Human human;

	public Writer(WritingAccessory writingAccessory, Human human) {
		this.writingAccessory = writingAccessory;
		this.human = human;
	}

	public void write() {
		showDetails();
		writingAccessory.write();
	}

	abstract public void showDetails();
}
