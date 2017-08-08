package behavioral.iterator;

class Main {

    public static void main(String[] args) {
	Tasks c = new Tasks();

	Iterator iterator = c.getIterator();
	while (iterator.hasNext()) {
	    System.out.println(iterator.next());
	}
    }
}
