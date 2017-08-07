package behavioral.command;

class ResetCommand implements Command {

    Computer computer;

    ResetCommand(Computer computer) {
	this.computer = computer;
    }

    @Override
    public void execute() {
	computer.reset();
    }
}
