package behavioral.chain_of_responsibility;

class SMSLogger extends Logger {

    SMSLogger(int priority) {
	super(priority);
    }

    @Override
    void showDetails(String message) {
	System.out.println("SMS: " + message);
    }
}
