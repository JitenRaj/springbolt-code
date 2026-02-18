package structural.flyweight;

public class Tree {
    private int x;
    private int y;
    private TreeType type; // Reference to the Flyweight

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        // Pass the extrinsic state (x,y) to the flyweight
        type.draw(x, y);
    }
}
