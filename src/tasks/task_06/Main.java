package tasks.task_06;

import tasks.task_06.model.SecretaryFacade;

public class Main {

    public static void main(String[] args) {
	SecretaryFacade secretary = new SecretaryFacade();

	secretary.workWithDirector();
	secretary.workWithManager();
	secretary.workWithAccountant();
    }

}
