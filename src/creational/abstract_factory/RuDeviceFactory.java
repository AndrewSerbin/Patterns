package creational.abstract_factory;

class RuDeviceFactory implements DeviceFactory {
	
	public Mouse getMouse() {
		return new RuMouse();
	}

	public Keyboard getKeyboard() {
		return new RuKeyboard();
	}

	public TouchPad getTouchPad() {
		return new RuTouchPad();
	}
}
