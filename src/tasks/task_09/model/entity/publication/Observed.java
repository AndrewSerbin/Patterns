package tasks.task_09.model.entity.publication;

import tasks.task_09.model.entity.user.Observer;

public interface Observed {

    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
