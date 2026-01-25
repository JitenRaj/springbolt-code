package creational.singleton;

public class EagerSingleton {

    // Instance is created immediately when the class is loaded into memory.
    // JVM guarantees this is thread-safe.
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // Private constructor to prevent instantiation from other classes.
    private EagerSingleton() {
        System.out.println("EagerSingleton initialized (at class loading).");
    }

    // Public method to provide access to the singleton instance
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello from EagerSingleton!");
    }
}
