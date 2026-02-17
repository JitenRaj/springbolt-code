package structural.decorator;

// Concrete Decorator 1: Milk
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        // Delegate to original object, then add own description
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        // Delegate to original object, then add own cost
        return super.getCost() + 1.50;
    }
}
