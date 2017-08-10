package tasks.task_09.model.entity.user;

import tasks.task_09.model.entity.publication.Publication;

public interface Observer {

    void handleEvent(Publication publication);
}
