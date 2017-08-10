package tasks.task_11.model.entity.user;

import tasks.task_11.model.command.Command;

public class User {

    private Command start;
    private Command stop;
    private Command reset;

    public User(Command start, Command stop, Command reset) {
	this.start = start;
	this.stop = stop;
	this.reset = reset;
    }

    public void startComputer() {
	start.execute();
    }

    public void stopComputer() {
	stop.execute();
    }

    public void resetComputer() {
	reset.execute();
    }
}
