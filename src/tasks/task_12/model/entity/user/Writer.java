package tasks.task_12.model.entity.user;

import tasks.task_12.model.entity.writing_accessory.WritingAccessory;

public abstract class Writer {

    private WritingAccessory writingAccessory;

    public Writer(WritingAccessory writingAccessory) {
	this.writingAccessory = writingAccessory;
    }

    public void write() {
	showDetails();
	writingAccessory.write();
    }

    abstract void showDetails();
}
