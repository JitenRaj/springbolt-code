package creational.abstractfactory;

// Concrete Product B1: Windows Checkbox
class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows style checkbox.");
    }
}
