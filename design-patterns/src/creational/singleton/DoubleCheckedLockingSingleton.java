package creational.singleton;

public class DoubleCheckedLockingSingleton {

    // 'volatile' is critical here. It prevents instruction reordering by the compiler.
    // Without volatile, a thread might see a non-null 'instance' reference
    // before the constructor has finished initializing the object.
    private static volatile DoubleCheckedLockingSingleton instance;

    // Private constructor to prevent instantiation from other classes
    private DoubleCheckedLockingSingleton() {
        System.out.println("DoubleCheckedLockingSingleton initialized.");
    }

    // Public method to provide access to the singleton instance
    public static DoubleCheckedLockingSingleton getInstance() {
        // First check (no locking) - Improves performance for existing instances
        if (instance == null) {
            // Synchronize only if the instance might need creation
            synchronized (DoubleCheckedLockingSingleton.class) {
                // Second check (inside lock) - Ensures only one thread creates the instance
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from DoubleCheckedLockingSingleton!");
    }
}
