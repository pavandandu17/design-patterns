public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    PopcornPopper popper;
    Lights lights;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer player,
                             Projector projector, PopcornPopper popper, Lights lights) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.popper = popper;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();

        lights.dim(11);

        projector.on();
        projector.setInput(player);
        projector.wideScreenMode();

        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);

        tuner.on();
        tuner.setAmplifier(amp);
        tuner.setFrequency(98.5);

        player.on();
        player.setAmplifier(amp);
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        projector.off();
        amp.off();
        tuner.off();
        player.off();
    }
}
