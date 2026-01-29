package structural.bridge;

// Refined Abstraction 3
class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Square drawn. ");
        color.applyColor();
    }
}
