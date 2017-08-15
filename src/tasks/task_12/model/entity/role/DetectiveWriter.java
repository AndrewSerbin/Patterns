package tasks.task_12.model.entity.user;

import tasks.task_12.model.entity.writing_accessory.WritingAccessory;

public class DetectiveWriter extends Writer {

    public DetectiveWriter(WritingAccessory writingAccessory) {
	super(writingAccessory);
    }

    @Override
    public void showDetails() {
	System.out.println("Detective");
    }
}
