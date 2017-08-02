package creational.factory_method;

class RomeWatchMaker implements WatchMaker {

	public Watch createWatch() {
		return new RomeWatch();
	}
	
}
