package devices;

public class Stereo {
    private String location;
    
    public Stereo(String location) {
        this.location = location;
    }
    
    public void on() {
        System.out.println(location + " stereo is ON");
    }
    
    public void off() {
        System.out.println(location + " stereo is OFF");
    }
    
    public void setCD() {
        System.out.println("Stereo is set for CD input");
    }
    
    public void setVolume(int volume) {
        System.out.println("Stereo volume set to " + volume);
    }
}
