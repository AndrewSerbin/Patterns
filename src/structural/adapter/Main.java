package structural.adapter;

class Main {

    public static void main(String[] args) {
	// using inheritance
	VectorGraphicsInterface g1 = new VectorAdapterFromRasterUsingInheritance();
	g1.drawLine();
	g1.drawSquare();

	// using composition
	g1 = new VectorAdapterFromRasterUsingComposition();
	g1.drawLine();
	g1.drawSquare();
    }

}
