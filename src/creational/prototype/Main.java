package creational.prototype;

class Main {

    public static void main(String[] args) {
	Human original = new Human(20, "John");
	Human copy = (Human) original.copy();

	System.out.println(original);
	System.out.println(copy);

	HumanFactory factory = new HumanFactory(copy);

	Human h1 = factory.makeCopy();
	System.out.println(h1);

	factory.setPrototype(new Human(30, "Ivan"));
	h1 = factory.makeCopy();
	System.out.println(h1);
    }
}
