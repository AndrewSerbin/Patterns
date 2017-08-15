package tasks.task_12.model.entity.state;

import tasks.task_12.model.entity.human.Human;
import tasks.task_12.model.entity.role.DetectiveWriter;
import tasks.task_12.model.entity.role.Writer;
import tasks.task_12.model.entity.writing_accessory.Pen;
import tasks.task_12.model.entity.writing_accessory.WritingAccessory;

public class DetectiveWriterState implements State {

	@Override
	public void make(Human human) {
		WritingAccessory writingAccessory = new Pen();
		Writer writer = new DetectiveWriter(writingAccessory, human);

		writer.write();
	}
}
