package tasks.task_12.model.entity.role;

import tasks.task_12.model.entity.human.Human;
import tasks.task_12.model.entity.writing_accessory.WritingAccessory;

public class DetectiveWriter extends Writer {

	public DetectiveWriter(WritingAccessory writingAccessory, Human human) {
		super(writingAccessory, human);
	}

	@Override
	public void showDetails() {
		System.out.println("Detective");
	}
}
