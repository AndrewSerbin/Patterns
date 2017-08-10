package tasks.task_09;

import tasks.task_09.model.entity.publication.Comics;
import tasks.task_09.model.entity.publication.Newspaper;
import tasks.task_09.model.entity.publication.PrintingHouse;
import tasks.task_09.model.entity.user.User;

public class Main {

    public static void main(String[] args) {
	PrintingHouse printingHouse = new PrintingHouse();

	User user = new User();
	printingHouse.addObserver(user);

	printingHouse.setPublication(new Newspaper());

	user.read();

	printingHouse.setPublication(new Comics());

	user.read();
    }

}
