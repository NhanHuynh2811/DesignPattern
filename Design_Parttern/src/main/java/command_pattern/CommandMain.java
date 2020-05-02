package command_pattern;

import command_pattern.concreate.CeilingFanCommand;
import command_pattern.concreate.GarageDoorOpenCommand;
import command_pattern.concreate.LightOffConmmand;
import command_pattern.concreate.LightOnCommand;
import command_pattern.invoker.CeilingFan;
import command_pattern.invoker.GarageDoor;
import command_pattern.invoker.Light;

public class CommandMain {
    public static void main(String[] args) {
        Light lightLivingRoom = new Light();
        LightOnCommand lightOnCommandLivingRoom = new LightOnCommand(lightLivingRoom);
        LightOffConmmand lightOffConmmandLivingRoom = new LightOffConmmand(lightLivingRoom);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,lightOnCommandLivingRoom,lightOffConmmandLivingRoom);
        remoteControl.onButtonWasPress(0);
        remoteControl.offButtonWasPress(0);

        CeilingFan ceilingFan = new CeilingFan("Living room");
        CeilingFanCommand ceilingFanCommand = new CeilingFanCommand(ceilingFan);
        remoteControl.setCommand(1,ceilingFanCommand,ceilingFanCommand);
        remoteControl.onButtonWasPress(1);
    }
}
