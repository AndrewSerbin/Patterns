package tasks.task_09.model.entity.publication;

public class Newspaper implements Publication {

    @Override
    public void read() {
	System.out.println("NewsPaper");
    }
}
