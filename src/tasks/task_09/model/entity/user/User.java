package tasks.task_09.model.entity.user;

import tasks.task_09.model.entity.publication.Publication;

public class User implements Observer {

    private Publication publication;

    @Override
    public void handleEvent(Publication publication) {
	this.publication = publication;
    }

    public void read() {
	publication.read();
    }
}
