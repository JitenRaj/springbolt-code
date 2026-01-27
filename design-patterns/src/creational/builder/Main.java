package creational.builder;

// Main class to demonstrate Builder Pattern
public class Main {
    public static void main(String[] args) {
        // Build a basic computer (only required args)
        Computer basicComputer = new Computer.ComputerBuilder("500 GB", "8 GB")
                .build();

        // Build a gaming computer (required + specific optional args)
        Computer gamingComputer = new Computer.ComputerBuilder("1 TB", "32 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .setSSD("500GB")
                .build();

        System.out.println("Basic Config: " + basicComputer);
        System.out.println("Gaming Config: " + gamingComputer);
    }
}
