package structural.facade;

class DVDRom {

    private boolean data = false;

    public boolean hasData() {
	return data;
    }

    void load() {
	// System.out.println("Disk loaded");
	data = true;
    }

    void unLoad() {
	// System.out.println("Disk unloaded");
	data = false;
    }
}
