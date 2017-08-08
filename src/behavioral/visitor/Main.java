package behavioral.visitor;

class Main {

    public static void main(String[] args) {
	Element body = new BodyElement();
	Element engine = new EngineElement();
	Visitor hooligan = new HooliganVisitor();

	body.accept(hooligan);
	engine.accept(hooligan);
    }

}
