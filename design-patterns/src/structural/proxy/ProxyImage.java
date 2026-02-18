package structural.proxy;

// Proxy
class ProxyImage implements Image {
    private String fileName;
    // Reference to the Real Subject. Set to null initially for lazy loading.
    private HighResolutionImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Control Access Logic: Lazy Loading
        // The real object is only created and loaded when display() is called for the first time.
        if (realImage == null) {
            realImage = new HighResolutionImage(fileName);
        }

        // Delegate the core operation to the Real Subject
        realImage.display();
    }
}
