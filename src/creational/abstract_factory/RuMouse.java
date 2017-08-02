package creational.abstract_factory;

class RuMouse implements Mouse {

	public void click() {
		System.out.println("Одинарный щелчок");
	}

	public void doubleClick() {
		System.out.println("Двойной щелчок");
	}

	public void scroll(int direction) {
		if (direction > 0) {
			System.out.println("Скроллим вверх");
		} else if (direction < 0) {
			System.out.println("Скроллим вниз");
		} else {
			System.out.println("Не скроллим");
		}
	}
}
