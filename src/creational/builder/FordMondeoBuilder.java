package creational.builder;

class FordMondeoBuilder extends CarBuilder {

    @Override
    void setMake() {
	car.setMake("Ford Mondeo");
    }

    @Override
    void setTransmission() {
	car.setTransmission(Transmission.AUTO);
    }

    @Override
    void setMaxSpeed() {
	car.setMaxSpeed(150);
    }
}
