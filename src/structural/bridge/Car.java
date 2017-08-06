package structural.bridge;

abstract class Car {

    Make make;

    public Car(Make make) {
	this.make = make;
    }

    void showDetails() {
	showType();
	make.setMake();
    }

    abstract void showType();
}
