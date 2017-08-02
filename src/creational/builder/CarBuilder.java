package creational.builder;

abstract class CarBuilder {

    Car car;

    void createCar() {
	car = new Car();
    }

    abstract void setMake();

    abstract void setTransmission();

    abstract void setMaxSpeed();

    public Car getCar() {
	return car;
    }
}

// class CarBuilder {
//
// String make = "Default";
// Transmission transmission = Transmission.MANUAL;
// int maxSpeed = 120;
//
// CarBuilder setMake(String make) {
// this.make = make;
// return this;
// }
// CarBuilder setTransmission(Transmission transmission) {
// this.transmission = transmission;
// return this;
// }
// CarBuilder setMaxSpeed(int maxSpeed) {
// this.maxSpeed = maxSpeed;
// return this;
// }
//
// Car build() {
// Car car = new Car();
// car.setMake(make);
// car.setTransmission(transmission);
// car.setMaxSpeed(maxSpeed);
//
// return car;
// }
// }
