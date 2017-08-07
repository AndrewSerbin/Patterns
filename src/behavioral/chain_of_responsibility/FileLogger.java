package behavioral.chain_of_responsibility;

class FileLogger extends Logger {

    FileLogger(int priority) {
	super(priority);
    }

    @Override
    void showDetails(String message) {
	System.out.println("File: " + message);
    }
}
