package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<>();

        // 1. Plant Oaks
        // The factory creates the "Oak" type once and reuses it
        TreeType oakType = TreeFactory.getTreeType("Oak", "Green", "OakTextureStub");
        forest.add(new Tree(10, 20, oakType));
        forest.add(new Tree(15, 25, oakType));
        forest.add(new Tree(20, 30, oakType));

        // 2. Plant Pines
        // The factory creates the "Pine" type once and reuses it
        TreeType pineType = TreeFactory.getTreeType("Pine", "DarkGreen", "PineTextureStub");
        forest.add(new Tree(100, 200, pineType));
        forest.add(new Tree(150, 250, pineType));

        System.out.println("\n--- Drawing Forest ---");
        for (Tree tree : forest) {
            tree.draw();
        }
    }
}
