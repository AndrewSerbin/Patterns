package behavioral.iterator;

class Tasks implements Container {

    String[] tasks = { "Task1", "Task2", "Task3" };

    @Override
    public Iterator getIterator() {
	return new TaskIterator();
    }

    private class TaskIterator implements Iterator {

	int index = 0;

	@Override
	public boolean hasNext() {
	    return index < tasks.length;
	}

	@Override
	public Object next() {
	    return tasks[index++];
	}
    }
}
