package creational.builder;

class Director {

    CarBuilder builder;

    Car buildCar() {
	builder.createCar();
	builder.setMake();
	builder.setTransmission();
	builder.setMaxSpeed();

	return builder.getCar();
    }

    public void setBuilder(CarBuilder builder) {
	this.builder = builder;
    }
}
