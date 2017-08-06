package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class ShapeFactory {

    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeName) {
	Shape shape = shapes.get(shapeName);

	if (shape == null) {
	    switch (shapeName) {
	    case "point":
		shape = new Point();
		break;
	    case "circle":
		shape = new Circle();
		break;
	    case "square":
		shape = new Square();
		break;
	    }
	    shapes.put(shapeName, shape);
	}

	return shape;
    }
}
