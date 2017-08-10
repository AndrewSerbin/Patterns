package tasks.task_11.model.command;

import tasks.task_11.model.entity.computer.Computer;

public class ResetCommand implements Command {

    private Computer computer;

    public ResetCommand(Computer computer) {
	this.computer = computer;
    }

    @Override
    public void execute() {
	computer.reset();
    }
}
