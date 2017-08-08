package behavioral.visitor;

class MechanicVisitor implements Visitor {

    @Override
    public void visit(EngineElement engine) {
	System.out.println("Good action with engine");
    }

    @Override
    public void visit(BodyElement body) {
	System.out.println("Good action with body");
    }
}
