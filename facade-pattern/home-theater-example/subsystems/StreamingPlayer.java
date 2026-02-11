public class StreamingPlayer {
    Amplifier amplifier;
    String movie;

    public void on() {
        System.out.println("Streaming player on");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("Streaming player playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println("Streaming player stopped \"" + movie + "\"");
    }

    public void off() {
        System.out.println("Streaming player off");
    }

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void pause() {
        System.out.println("Streaming player paused \"" + movie + "\"");
    }

    public void setTwoChannelAudio() {
        System.out.println("Streaming player set two channel audio");
    }

    public void setSurroundAudio() {
        System.out.println("Streaming player set surround audio");
    }
}
