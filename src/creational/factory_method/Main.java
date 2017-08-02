package creational.factory_method;

class Main {

    public static void main(String[] args) {
	// WatchMaker maker = new RomeWatchMaker();// DigitalWatchMaker();

	WatchMaker maker = getMakerByName("asd");

	Watch watch = maker.createWatch();
	watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker) {
	if (maker.equals("Digital")) {
	    return new DigitalWatchMaker();
	} else if (maker.equals("Rome")) {
	    return new RomeWatchMaker();
	}

	throw new RuntimeException("Не поддерживаемая производственная линия часов" + maker);
    }
}
