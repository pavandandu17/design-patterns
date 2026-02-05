package devices;

public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        // Code to connect to hardware to switch on
        System.out.println(location + " light is ON");
    }

    public void off() {
        // Code to connect to hardware to switch off
        System.out.println(location + " light is OFF");
    }
}