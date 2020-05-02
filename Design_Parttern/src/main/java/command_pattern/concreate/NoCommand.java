package command_pattern.concreate;

import command_pattern.Command;

public class NoCommand implements Command {
    public NoCommand() {
    }

    @Override
    public void execute() {
        System.out.println("NO COMMAND");
    }
}
