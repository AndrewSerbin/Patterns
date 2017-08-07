package behavioral.chain_of_responsibility;

class EmailLogger extends Logger {

    EmailLogger(int priority) {
	super(priority);
    }

    @Override
    void showDetails(String message) {
	System.out.println("Email: " + message);
    }
}
