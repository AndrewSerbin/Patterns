package structural.decorator;

class LeftBracketDecorator extends Decorator {

    LeftBracketDecorator(PrintInterface component) {
	super(component);
    }

    @Override
    public void print() {
	System.out.println("[");
	component.print();
    }

}
