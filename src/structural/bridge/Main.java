package structural.bridge;

class Main {

    public static void main(String[] args) {
	Car car = new Sedan(new Skoda());
	car.showDetails();
    }
}
