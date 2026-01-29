package structural.bridge;

// Abstraction
public abstract class Shape {
    // Composition - The "Bridge"
    protected Color color;

    // Constructor acts as the bridge setter
    public Shape(Color color) {
        this.color = color;
    }

    abstract public void draw();
}