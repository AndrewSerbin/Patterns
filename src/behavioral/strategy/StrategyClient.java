package behavioral.strategy;

class StrategyClient {

    Sorting strategy;

    public void setStrategy(Sorting strategy) {
	this.strategy = strategy;
    }

    public void executeStratagy(int[] arr) {
	strategy.sort(arr);
    }
}
