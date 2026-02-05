package commands;

import devices.CeilingFan;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.low();   
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
