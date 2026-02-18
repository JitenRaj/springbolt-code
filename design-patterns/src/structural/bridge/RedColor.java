package structural.bridge;

// Concrete Implementor 1
class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color.");
    }
}
