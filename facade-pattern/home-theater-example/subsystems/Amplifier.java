public class Amplifier {
    StreamingPlayer player;
    Tuner tuner;
    
    public void on() {
        System.out.println("Amplifier on");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int level) {
        System.out.println("Amplifier setting volume to " + level);
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setStereoSound() {
        System.out.println("Amplifier stereo mode on");
    }
}
