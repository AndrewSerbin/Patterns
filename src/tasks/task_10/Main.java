package tasks.task_10;

import tasks.task_10.model.dvi.DVI;
import tasks.task_10.model.dvi.DVIAdapterFromSVGA;

public class Main {

    public static void main(String[] args) {
	DVI dvi = new DVIAdapterFromSVGA();

	dvi.show();
    }

}
