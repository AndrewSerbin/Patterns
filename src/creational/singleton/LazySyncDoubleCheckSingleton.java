package creational.singleton;

class LazySyncDoubleCheckSingleton {

	static int counter;
	private static volatile LazySyncDoubleCheckSingleton instance;
	
	private LazySyncDoubleCheckSingleton() { 
		counter++;
	}

	public static LazySyncDoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (LazySyncDoubleCheckSingleton.class) {
				if (instance == null) {
					instance = new LazySyncDoubleCheckSingleton();		
				}
			}
		}
		
		return instance;
	}
}
