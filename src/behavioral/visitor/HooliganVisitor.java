package behavioral.visitor;

class HooliganVisitor implements Visitor {

    @Override
    public void visit(EngineElement engine) {
	System.out.println("Bad action with engine");
    }

    @Override
    public void visit(BodyElement body) {
	System.out.println("Bad action with body");
    }
}
