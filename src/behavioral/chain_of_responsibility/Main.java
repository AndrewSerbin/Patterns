package behavioral.chain_of_responsibility;

class Main {

    public static void main(String[] args) {
	Logger sms = new SMSLogger(Level.ERROR);
	Logger file = new FileLogger(Level.DEBUG);
	Logger email = new EmailLogger(Level.INFO);
	sms.setNext(file);
	file.setNext(email);

	sms.writeMessage("Some info", Level.INFO);
	sms.writeMessage("Some debug", Level.DEBUG);
	sms.writeMessage("Some error", Level.ERROR);
    }

}
