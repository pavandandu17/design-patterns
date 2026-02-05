package commands;

import devices.CeilingFan;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.off();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.OFF) {
            this.ceilingFan.off();
        } else if(prevSpeed == CeilingFan.LOW) {
            this.ceilingFan.low();
        } else if(prevSpeed == CeilingFan.MEDIUM) {
            this.ceilingFan.medium();
        } else if(prevSpeed == CeilingFan.HIGH) {
            this.ceilingFan.high();
        }
    }
    
}
