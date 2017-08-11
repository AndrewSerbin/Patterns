package tasks.task_12;

import tasks.task_12.model.entity.user.Artist;
import tasks.task_12.model.entity.user.DetectiveWriter;
import tasks.task_12.model.entity.user.Writer;
import tasks.task_12.model.entity.writing_accessory.Brush;
import tasks.task_12.model.entity.writing_accessory.Pen;
import tasks.task_12.model.entity.writing_accessory.WritingAccessory;

public class Main {

    public static void main(String[] args) {
	WritingAccessory writingAccessory = new Pen();
	Writer writer = new DetectiveWriter(writingAccessory);

	writer.write();

	writingAccessory = new Brush();
	writer = new Artist(writingAccessory);

	writer.write();
    }
}
