package tasks.task_11.model.command;

import tasks.task_11.model.entity.computer.Computer;

public class StartCommand implements Command {

    private Computer computer;

    public StartCommand(Computer computer) {
	this.computer = computer;
    }

    @Override
    public void execute() {
	computer.start();
    }
}
