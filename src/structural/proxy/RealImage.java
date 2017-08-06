package structural.proxy;

class RealImage implements Image {

    String file;

    public RealImage(String file) {
	this.file = file;
	load();
    }

    public void load() {
	System.out.println("Loading" + file);
    }

    public @Override void display() {
	System.out.println("Watching" + file);
    }

}
