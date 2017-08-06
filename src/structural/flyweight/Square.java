package structural.flyweight;

class Square implements Shape {

    int a = 10;

    @Override
    public void draw(int x, int y) {
	System.out.println("Draw square. side" + a + "center" + x + " " + y);// TODO Auto-generated method stub
    }

}
