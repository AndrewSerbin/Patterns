package behavioral.template_method;

abstract class C {

    void templateMethod() {
	System.out.println(1);
	differ();
	System.out.println(3);
	differ2();
    }

    abstract void differ();

    abstract void differ2();
}
