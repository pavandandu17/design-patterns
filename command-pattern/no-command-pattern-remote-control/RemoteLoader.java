import devices.Light;
import devices.Stereo;
import devices.TV;

public class RemoteLoader {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        Light kitchenRoomLight = new Light("Kitchen");
        TV livingRoomTV = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");

        RemoteControl remoteControl = new RemoteControl(livingRoomLight, kitchenRoomLight, livingRoomTV, stereo);
        System.out.println("========= Testing Remote Control ========\n");

        // Test button 1
        System.out.println("-- Pressing Buttong 1 ON --");
        remoteControl.onButtonWasPushed1();
        System.out.println("-- Pressing Button 1 OFF --");
        remoteControl.offButtonWasPushed1();
        System.out.println();

        // Test button 2
        System.out.println("-- Pressing Buttong 2 ON --");
        remoteControl.onButtonWasPushed2();
        System.out.println("-- Pressing Button 2 OFF --");
        remoteControl.offButtonWasPushed2();
        System.out.println();
        
        // Test button 3 - TV
        System.out.println("-- Pressing Button 3 ON --");
        remoteControl.onButtonWasPushed3();
        System.out.println("-- Pressing Button 3 OFF --");
        remoteControl.offButtonWasPushed3();
        System.out.println();
        
        // Test button 4 - Stereo
        System.out.println("-- Pressing Button 4 ON --");
        remoteControl.onButtonWasPushed4();
        System.out.println("-- Pressing Button 4 OFF --");
        remoteControl.offButtonWasPushed4();
        System.out.println();
    }
}
