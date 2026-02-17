package structural.decorator;

public class Main {
    public static void main(String[] args) {
        // 1. Order a simple coffee (Base Component)
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " -> $" + myCoffee.getCost());

        // 2. Add Milk (Wrap the coffee in MilkDecorator)
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " -> $" + myCoffee.getCost());

        // 3. Add Sugar (Wrap the result in SugarDecorator)
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " -> $" + myCoffee.getCost());
    }
}
