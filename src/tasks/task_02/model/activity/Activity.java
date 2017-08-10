package tasks.task_02.model.activity;

import tasks.task_02.model.Environment;

public interface Activity {

    void work();

    boolean isAvailable(Environment environment);
}
