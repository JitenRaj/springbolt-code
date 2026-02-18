package structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
class Manager implements Employee {
    private String name;
    private long empId;
    private String position;

    // The collection acts as the container for children
    private List<Employee> subordinates;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
        this.subordinates = new ArrayList<>();
    }

    // Methods to manage the tree structure
    public void addEmployee(Employee emp) {
        subordinates.add(emp);
    }

    public void removeEmployee(Employee emp) {
        subordinates.remove(emp);
    }

    @Override
    public void showDetails() {
        System.out.println("---------------------------------");
        System.out.println("Manager: " + name + " (" + position + ")");
        System.out.println("Subordinates:");

        // Delegates work to children recursively
        for (Employee emp : subordinates) {
            emp.showDetails();
        }

        System.out.println("---------------------------------");
    }
}
