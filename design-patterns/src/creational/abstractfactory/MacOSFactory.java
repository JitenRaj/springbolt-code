package creational.abstractfactory;

// Concrete Factory 2: MacOS Factory
// Produces only MacOS-compatible components
class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
