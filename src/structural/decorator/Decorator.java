package structural.decorator;

abstract class Decorator implements PrintInterface {

    PrintInterface component;

    Decorator(PrintInterface component) {
	this.component = component;
    }
}
