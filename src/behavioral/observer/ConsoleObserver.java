package behavioral.observer;

class ConsoleObserver implements Observer {

    @Override
    public void handleEvent(int temperature, int pressure) {
	System.out.println("Temp " + temperature + "pressure" + pressure);
    }
}
