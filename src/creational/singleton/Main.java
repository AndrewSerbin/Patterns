package creational.singleton;

class Main {

	public static void main(String[] args) throws InterruptedException {
		final int SIZE = 1000;
		
		Thread t[] = new Thread[SIZE];
		
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(new R());
			t[i].start();
		}
		
		for (int i = 0; i < t.length; i++) {
			t[i].join();
		}
		
//		System.out.println(Singleton.counter);
//		System.out.println(SingletonForMultyThreading.counter);
		System.out.println(LazySyncDoubleCheckSingleton.counter);
	}
}

class R implements Runnable {

	@Override
	public void run() {
//		Singleton.getInstance();
//		SingletonForMultyThreading.getInstance();
		LazySyncDoubleCheckSingleton.getInstance();
	}	
}
