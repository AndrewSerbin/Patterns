package tasks.task_12.model.entity.user;

import tasks.task_12.model.entity.writing_accessory.WritingAccessory;

public class Artist extends Writer {

    public Artist(WritingAccessory writingAccessory) {
	super(writingAccessory);
    }

    @Override
    public void showDetails() {
	System.out.println("Painter");
    }
}
