package structural.facade;

public class HomeTheaterFacade {
    // Composition: The Facade holds references to all subsystem objects
    private Amplifier amp;
    private Projector projector;
    private Screen screen;
    private Lights lights;

    public HomeTheaterFacade(Amplifier amp, Projector projector, Screen screen, Lights lights) {
        this.amp = amp;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
    }

    // Simplified method for the client: START MOVIE
    public void watchMovie(String movie) {
        System.out.println("\n--- Get ready to watch a movie: " + movie + " ---");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setVolume(5);
    }

    // Simplified method for the client: END MOVIE
    public void endMovie() {
        System.out.println("\n--- Shutting down the home theater ---");
        lights.dim(100); // Turn lights back on
        screen.up();
        projector.off();
        amp.off();
    }
}
