package creational.prototype;

import java.util.Hashtable;

// Prototype Registry
import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        // Returns a clone of the cached object, not the original reference
        return (Shape) cachedShape.clone();
    }

    // Simulate expensive database load
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("CIR");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("RECT");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("SQR");
        shapeMap.put(square.getId(), square);
    }
}
