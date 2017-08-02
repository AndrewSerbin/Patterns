package creational.builder;

class SubaruBuilder extends CarBuilder {

    @Override
    void setMake() {
	car.setMake("Subaru");
    }

    @Override
    void setTransmission() {
	car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void setMaxSpeed() {
	car.setMaxSpeed(210);
    }
}
