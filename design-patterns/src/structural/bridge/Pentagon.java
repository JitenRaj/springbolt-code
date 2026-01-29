package structural.bridge;

// Refined Abstraction 2
class Pentagon extends Shape {
    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Pentagon drawn. ");
        color.applyColor();
    }
}
