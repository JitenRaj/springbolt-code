package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    // Cache to store the flyweight objects
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String otherTreeData) {
        // If the type exists, return it. If not, create it and store it.
        TreeType result = treeTypes.get(name);

        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
            System.out.println("--> Creating new TreeType: " + name);
        }
        return result;
    }
}
