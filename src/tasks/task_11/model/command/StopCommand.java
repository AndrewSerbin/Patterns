package tasks.task_11.model.command;

import tasks.task_11.model.entity.computer.Computer;

public class StopCommand implements Command {

    private Computer computer;

    public StopCommand(Computer computer) {
	this.computer = computer;
    }

    @Override
    public void execute() {
	computer.stop();
    }
}
