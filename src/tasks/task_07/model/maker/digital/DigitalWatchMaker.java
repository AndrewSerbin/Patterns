package tasks.task_07.model.maker.digital;

import tasks.task_07.model.entity.Watch;
import tasks.task_07.model.entity.digital.DigitalWatch;
import tasks.task_07.model.maker.WatchMaker;

public class DigitalWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
	return new DigitalWatch();
    }

}
