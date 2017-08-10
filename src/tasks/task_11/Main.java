package tasks.task_11;

import tasks.task_11.model.command.ResetCommand;
import tasks.task_11.model.command.StartCommand;
import tasks.task_11.model.command.StopCommand;
import tasks.task_11.model.entity.computer.Computer;
import tasks.task_11.model.entity.user.User;

class Main {

    public static void main(String[] args) {
	Computer computer = new Computer();
	User user = new User(new StartCommand(computer), new StopCommand(computer), new ResetCommand(computer));

	user.startComputer();
	user.stopComputer();
	user.resetComputer();
    }
}
