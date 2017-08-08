package behavioral.template_method;

class Main {

    public static void main(String[] args) {
	C c = new A();
	c.templateMethod();

	c = new B();
	c.templateMethod();
    }

}
