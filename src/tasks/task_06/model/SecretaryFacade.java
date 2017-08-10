package tasks.task_06.model;

import tasks.task_06.model.entity.Accountant;
import tasks.task_06.model.entity.Director;
import tasks.task_06.model.entity.Manager;
import tasks.task_06.model.entity.Worker;

public class SecretaryFacade {

    Worker director = new Director();
    Worker manager = new Manager();
    Worker accountant = new Accountant();

    public void workWithDirector() {
	director.work();
    }

    public void workWithManager() {
	manager.work();
    }

    public void workWithAccountant() {
	accountant.work();
    }
}
