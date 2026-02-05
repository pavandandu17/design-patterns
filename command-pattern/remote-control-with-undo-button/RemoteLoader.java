import commands.CeilingFanOffCommand;
import commands.CeilingFanOnCommand;
import commands.LightOffCommand;
import commands.LightOnCommand;
import commands.StereoOffCommand;
import commands.StereoOnWithCDCommand;
import devices.CeilingFan;
import devices.Light;
import devices.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoonLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        
        remoteControl.setCommand(0, livingRoonLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
    }
}
