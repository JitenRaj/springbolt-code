package structural.proxy;

public class Main {
    public static void main(String[] args) {
        // The client creates the proxy, but the expensive image is NOT loaded yet.
        System.out.println("Client creating ProxyImage instance...");
        Image image = new ProxyImage("very_large_photo.jpg");

        // The image is displayed for the first time. Loading occurs now.
        System.out.println("\n--- First display call ---");
        image.display();

        // The image is displayed a second time. Loading is skipped (cached).
        System.out.println("\n--- Second display call (using cached object) ---");
        image.display();
    }
}
