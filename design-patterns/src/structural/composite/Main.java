package structural.composite;

public class Main {
    public static void main(String[] args) {
        // 1. Create Leaf nodes (Individual Contributors)
        Developer dev1 = new Developer(101, "Alice", "Java Developer");
        Developer dev2 = new Developer(102, "Bob", "Python Developer");
        Designer des1 = new Designer(103, "Carol", "UI/UX Designer");

        // 2. Create Composite nodes (Managers)
        Manager engManager = new Manager(200, "Daniel", "Engineering Manager");
        Manager genManager = new Manager(300, "Eve", "General Manager");

        // 3. Build the Tree
        // Daniel manages Alice and Bob
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        // Eve manages Daniel (who manages others) and Carol (direct report)
        genManager.addEmployee(engManager);
        genManager.addEmployee(des1);

        // 4. Print the entire hierarchy
        // The client simply calls showDetails() on the root
        genManager.showDetails();
    }
}
