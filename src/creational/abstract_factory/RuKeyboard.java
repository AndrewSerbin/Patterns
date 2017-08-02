package creational.abstract_factory;

class RuKeyboard implements Keyboard {

	public void print() {
		System.out.print("Печатаем без перевода");
	}

	public void println() {
		System.out.println("Печатаем с переводом");
	}
}
