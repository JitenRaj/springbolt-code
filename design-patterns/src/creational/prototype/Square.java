package creational.prototype;

// Concrete Prototype 3: Square
public class Square extends Shape{
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
