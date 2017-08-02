package creational.singleton;

class Singleton {

    static int counter;
    private static Singleton instance;

    private Singleton() {
	counter++;
    }

    public /* synchronized */ static Singleton getInstance() {
	if (instance == null) {
	    instance = new Singleton();
	}

	return instance;
    }
}
