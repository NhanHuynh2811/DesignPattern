package command_pattern.concreate;

import command_pattern.Command;
import command_pattern.invoker.Light;

public class LightOffConmmand implements Command {

    private Light light;

    public LightOffConmmand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
