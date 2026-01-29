package structural.bridge;

// Concrete Implementor 2
class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying green color.");
    }
}
