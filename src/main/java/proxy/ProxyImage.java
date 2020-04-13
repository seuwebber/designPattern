package proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void disPaly() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.disPaly();
    }
}
