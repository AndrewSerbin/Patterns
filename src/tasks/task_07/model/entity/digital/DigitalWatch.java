package tasks.task_07.model.entity.digital;

import java.util.Date;

import tasks.task_07.model.entity.Watch;

public class DigitalWatch implements Watch {

    @Override
    public void showTime() {
	System.out.println(new Date());
    }

}
