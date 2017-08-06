package structural.adapter;

class VectorAdapterFromRasterUsingInheritance extends RasterGraphics implements VectorGraphicsInterface {

    @Override
    public void drawLine() {
	drawRasterLine();
    }

    @Override
    public void drawSquare() {
	drawRasterSquare();
    }

}
