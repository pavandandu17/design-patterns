public class Tuner {
    Amplifier amplifier;

    public void on() {
        System.out.println("Tuner on");
    }

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void setFrequency(double frequency) {
        System.out.println("Tuner setting frequency to " + frequency);
    }

    public void off() {
        System.out.println("Tuner off");
    }

    public void setAm() {
        System.out.println("Tuner setting AM mode");
    }

    public void setFm() {
        System.out.println("Tuner setting FM mode");
    }
}
