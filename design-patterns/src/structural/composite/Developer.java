package structural.composite;

// Leaf 1
class Developer implements Employee {
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(empId + " " + name + " (" + position + ")");
    }
}
