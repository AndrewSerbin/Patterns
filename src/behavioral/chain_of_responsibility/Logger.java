package behavioral.chain_of_responsibility;

abstract class Logger {

    int priority;
    Logger next;

    Logger(int priority) {
	this.priority = priority;
    }

    void setNext(Logger next) {
	this.next = next;
    }

    void writeMessage(String message, int level) {
	if (level <= priority) {
	    showDetails(message);
	}
	if (next != null) {
	    next.writeMessage(message, level);
	}
    }

    abstract void showDetails(String message);
}
