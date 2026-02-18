package structural.composite;

// Leaf 2
class Designer implements Employee {
    private String name;
    private long empId;
    private String position;

    public Designer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(empId + " " + name + " (" + position + ")");
    }
}
