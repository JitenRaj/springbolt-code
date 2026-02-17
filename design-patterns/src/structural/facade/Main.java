package structural.facade;

public class Main {
    public static void main(String[] args) {
        // Instantiate the complex subsystem components
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Lights lights = new Lights();

        // Create the Facade, passing the components
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, projector, screen, lights);

        // Client calls a single method on the Facade
        homeTheater.watchMovie("The Design Pattern Documentary");

        // Client calls another single method
        homeTheater.endMovie();
    }
}
