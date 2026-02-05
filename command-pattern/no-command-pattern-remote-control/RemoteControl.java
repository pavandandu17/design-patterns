import devices.Light;
import devices.Stereo;
import devices.TV;

public class RemoteControl {
    private Light livingRoomLight;
    private Light kitchenLight;
    private TV livingRoomTV;
    private Stereo stereo;

    public RemoteControl(Light livingRoomLight, Light kitchenLight, TV livingRoomTv, Stereo stereo) {
        this.livingRoomLight = livingRoomLight;
        this.kitchenLight = kitchenLight;
        this.livingRoomTV = livingRoomTv;
        this.stereo = stereo;
    }

    // Button 1: Living Room Light
    public void onButtonWasPushed1() {
        livingRoomLight.on();
    }
    
    public void offButtonWasPushed1() {
        livingRoomLight.off();
    }
    
    // Button 2: Kitchen Light
    public void onButtonWasPushed2() {
        kitchenLight.on();
    }
    
    public void offButtonWasPushed2() {
        kitchenLight.off();
    }
    
    // Button 3: Living Room TV
    public void onButtonWasPushed3() {
        livingRoomTV.on();
        livingRoomTV.setInputChannel();
    }
    
    public void offButtonWasPushed3() {
        livingRoomTV.off();
    }
    
    // Button 4: Stereo
    public void onButtonWasPushed4() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
    
    public void offButtonWasPushed4() {
        stereo.off();
    }
}
