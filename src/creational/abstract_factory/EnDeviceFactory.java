package creational.abstract_factory;

class EnDeviceFactory implements DeviceFactory {

	public Mouse getMouse() {
		return new EnMouse();
	}

	public Keyboard getKeyboard() {
		return new EnKeyboard();
	}

	public TouchPad getTouchPad() {
		return new EnTouchPad();
	}
}
