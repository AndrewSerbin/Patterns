package creational.singleton;

class SingletonForMultyThreading {

    static int counter;
    private static SingletonForMultyThreading instance = new SingletonForMultyThreading();

    private SingletonForMultyThreading() {
	counter++;
    }

    public static SingletonForMultyThreading getInstance() {
	return instance;
    }
}
