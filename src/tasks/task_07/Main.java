package tasks.task_07;

import tasks.task_07.model.entity.Watch;
import tasks.task_07.model.maker.WatchMaker;
import tasks.task_07.model.maker.digital.DigitalWatchMaker;
import tasks.task_07.model.maker.rome.RomeWatchMaker;

class Main {

    public static void main(String[] args) {
	// WatchMaker maker = new RomeWatchMaker();// DigitalWatchMaker();

	WatchMaker maker = getMakerByName("Rome");

	Watch watch = maker.createWatch();
	watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker) {
	if (maker.equals("Digital")) {
	    return new DigitalWatchMaker();
	} else if (maker.equals("Rome")) {
	    return new RomeWatchMaker();
	}

	throw new RuntimeException("Не поддерживаемая производственная линия часов" + maker);
    }
}
