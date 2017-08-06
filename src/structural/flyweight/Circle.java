package structural.flyweight;

class Circle implements Shape {

    int r = 5;

    @Override
    public void draw(int x, int y) {
	System.out.println("Draw circle r" + r + "center" + x + " " + y);
    }

}
