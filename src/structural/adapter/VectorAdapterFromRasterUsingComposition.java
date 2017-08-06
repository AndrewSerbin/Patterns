package structural.adapter;

class VectorAdapterFromRasterUsingComposition implements VectorGraphicsInterface {

    RasterGraphics rasterGraphics = new RasterGraphics();

    @Override
    public void drawLine() {
	rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
	rasterGraphics.drawRasterSquare();
    }

}
