package structural.decorator;

class Main {

    public static void main(String[] args) {
	// PrintInterface printer = new Printer("123");
	PrintInterface printer = 
		new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("123"))));
	printer.print();
    }
}
