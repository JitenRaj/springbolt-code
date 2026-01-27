package creational.prototype;

// Client Code
public class Main {
    public static void main(String[] args) {
        // 1. Initialize the cache (create prototypes)
        ShapeCache.loadCache();

        // 2. Retrieve clones from the registry
        Shape clonedShape1 = ShapeCache.getShape("CIR");
        System.out.println("Shape : " + clonedShape1.getType());
        clonedShape1.draw();

        Shape clonedShape2 = ShapeCache.getShape("RECT");
        System.out.println("Shape : " + clonedShape2.getType());
        clonedShape2.draw();

        // 3. Verify that it is a clone (different memory address)
        Shape clonedShape3 = ShapeCache.getShape("CIR");
        if (clonedShape1 != clonedShape3) {
            System.out.println("Success: clonedShape1 and clonedShape3 are different objects in memory.");
        }
        clonedShape3.draw();

        // 4. Retrieve another clone from the registry
        Shape clonedShape4 = ShapeCache.getShape("SQR");
        System.out.println("Shape : " + clonedShape4.getType());
        clonedShape4.draw();
    }
}
