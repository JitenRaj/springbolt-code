package structural.bridge;

// Refined Abstraction 1
class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Triangle drawn. ");
        color.applyColor();
    }
}
