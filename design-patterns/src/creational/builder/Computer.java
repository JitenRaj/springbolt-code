package creational.builder;

// Product Class
public class Computer {
    // Required parameters
    private String HDD;
    private String RAM;

    // Optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private String SSD;

    // 1. Private Constructor
    // Takes the Builder object as a parameter to initialize fields
    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.SSD = builder.SSD;
    }

    // Getters
    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public String getSSD() {
        return SSD;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Computer [HDD =" + HDD + ", RAM =" + RAM +
                ", GraphicsCard =" + isGraphicsCardEnabled +
                ", Bluetooth =" + isBluetoothEnabled +
                ", SSD =" + SSD + "]";
    }

    // 2. Static Inner Builder Class
    public static class ComputerBuilder {

        // Same fields as the outer class
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
        private String SSD;

        // 3. Constructor for Required Parameters
        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        // 4. Setter methods for Optional Parameters
        // These return the Builder object itself to allow method chaining (Fluent Interface)
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public ComputerBuilder setSSD(String SSD) {
            this.SSD = SSD;
            return this;
        }

        // 5. Build Method
        // Returns the final constructed object
        public Computer build() {
            return new Computer(this);
        }
    }
}