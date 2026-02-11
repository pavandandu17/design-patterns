public class HomeTheater {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        PopcornPopper popper = new PopcornPopper();
        Lights lights = new Lights();

        popper.on();
        popper.pop();

        lights.dim(13);

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
        player.play("Raiders of the Lost Ark");
    }
}
