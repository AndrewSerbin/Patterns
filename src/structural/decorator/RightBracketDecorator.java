package structural.decorator;

class RightBracketDecorator extends Decorator {

    RightBracketDecorator(PrintInterface component) {
	super(component);
    }

    @Override
    public void print() {
	component.print();
	System.out.println("]");
    }

}
