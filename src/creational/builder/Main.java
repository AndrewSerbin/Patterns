package creational.builder;

class Main {

	public static void main(String... args) {
//		Car car = new CarBuilder()
//							.setMake("Mers")
//							.setTransmission(Transmission.AUTO)
//							.setMaxSpeed(200)
//							.build();
		
		Director director = new Director();
		director.setBuilder(getBuilderByName("FM"));
		
		Car car = director.buildCar();
		
		System.out.println(car);
	}
	
	public static CarBuilder getBuilderByName(String make) {
		switch (make) {
		case "FM":
			return new FordMondeoBuilder();
		case "SU":
			return new SubaruBuilder();
		default:
			throw new RuntimeException("Марка не поддерживается" + make);
		}
	}
}
