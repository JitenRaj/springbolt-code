package structural.decorator;

// Concrete Component (The base object)
public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
