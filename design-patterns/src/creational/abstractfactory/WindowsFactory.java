package creational.abstractfactory;

// Concrete Factory 1: Windows Factory
// Produces only Windows-compatible components
class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
