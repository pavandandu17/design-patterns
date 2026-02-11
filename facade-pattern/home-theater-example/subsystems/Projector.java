public class Projector {
    StreamingPlayer player;
    public void on() {
        System.out.println("Projector on");
    }
    
    public void off() {
        System.out.println("Projector off");
    }

    public void tvMode() {
        System.out.println("Projector set to TV mode");
    }

    public void wideScreenMode() {
        System.out.println("Projector set to wide screen mode");
    }

    public void setInput(StreamingPlayer player) {
        this.player = player;
        System.out.println("Projector setting input to streaming player");
    }
}
