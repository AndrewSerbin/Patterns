package behavioral.strategy;

class Main {

    public static void main(String[] args) {
	StrategyClient client = new StrategyClient();

	int[] arr0 = { 3, 4, 2, 5 };
	client.setStrategy(new SelectingSort());
	client.executeStratagy(arr0);

	int[] arr1 = { 6, 4, 2, 3 };
	client.setStrategy(new BubbleSort());
	client.executeStratagy(arr1);
    }
}
