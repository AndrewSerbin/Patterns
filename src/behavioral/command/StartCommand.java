package behavioral.command;

class StartCommand implements Command {

    Computer computer;

    StartCommand(Computer computer) {
	this.computer = computer;
    }

    @Override
    public void execute() {
	computer.start();
    }
}
