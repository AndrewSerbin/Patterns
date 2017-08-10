package tasks.task_07.model.maker.rome;

import tasks.task_07.model.entity.Watch;
import tasks.task_07.model.entity.rome.RomeWatch;
import tasks.task_07.model.maker.WatchMaker;

public class RomeWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
	return new RomeWatch();
    }

}
