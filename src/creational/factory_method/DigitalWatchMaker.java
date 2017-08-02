package creational.factory_method;

class DigitalWatchMaker implements WatchMaker {

	public Watch createWatch() {
		return new DigitalWatch();
	}

}
