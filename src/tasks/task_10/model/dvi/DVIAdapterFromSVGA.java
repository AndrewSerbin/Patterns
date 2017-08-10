package tasks.task_10.model.dvi;

import tasks.task_10.model.svga.SVGA;

public class DVIAdapterFromSVGA implements DVI {

    SVGA svga = new SVGA();

    @Override
    public void show() {
	svga.show();
    }
}
