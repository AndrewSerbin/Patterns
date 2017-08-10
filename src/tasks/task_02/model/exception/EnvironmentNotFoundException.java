package tasks.task_02.model.exception;

public class EnvironmentNotFoundException extends Exception {

    public EnvironmentNotFoundException() {
	super();
    }

    public EnvironmentNotFoundException(String message) {
	super(message);
    }
}
