package structural.flyweight;

// The Flyweight
// This class contains the state shared by many trees (Name, Color, Texture data)
public class TreeType {
    private String name;
    private String color;
    private String otherTreeData; // e.g., Texture

    public TreeType(String name, String color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    // The operation that requires extrinsic state (x, y)
    public void draw(int x, int y) {
        System.out.println("Drawing Tree [" + name + ", " + color + "] at (" + x + ", " + y + ")");
    }
}
