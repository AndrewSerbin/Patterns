package creational.abstract_factory;

class Main {

    public static void main(String[] args) {
	DeviceFactory deviceFactory = getFactoryByName("EN");

	Mouse mouse = deviceFactory.getMouse();
	Keyboard keyboard = deviceFactory.getKeyboard();
	TouchPad touchPad = deviceFactory.getTouchPad();

	mouse.click();
	keyboard.print();
	touchPad.track(0, 10);
    }

    public static DeviceFactory getFactoryByName(String language) {
	switch (language) {
	case "RU":
	    return new RuDeviceFactory();
	case "EN":
	    return new EnDeviceFactory();
	default:
	    throw new RuntimeException("Язык не поддкрживается" + language);
	}
    }
}
