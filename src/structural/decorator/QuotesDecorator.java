package structural.decorator;

class QuotesDecorator extends Decorator {

    QuotesDecorator(PrintInterface component) {
	super(component);
    }

    @Override
    public void print() {
	System.out.println("!");
	component.print();
	System.out.println("!");
    }

}
