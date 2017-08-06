package structural.proxy;

class Main {

    public static void main(String[] args) {
	Image image = new ProxyImage("D:/file.jpg");
	image.display();
    }

}
