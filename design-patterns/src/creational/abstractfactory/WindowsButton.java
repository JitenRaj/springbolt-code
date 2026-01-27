package creational.abstractfactory;

// Concrete Product A1: Windows Button
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows style button.");
    }
}
