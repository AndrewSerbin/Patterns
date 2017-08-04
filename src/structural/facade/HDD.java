package structural.facade;

class HDD {

    void copyFromDVD(DVDRom dvd) {
	if (dvd.hasData()) {
	    System.out.println("Copying from dvd");
	} else {
	    System.out.println("Input pls dvd");
	}
    }
}
