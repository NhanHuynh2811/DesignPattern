package command_pattern.invoker;

public class GarageDoor {

    public GarageDoor() {
    }

    public void up() {
        System.out.println("DOOR IS UP");
    }

    public void down() {
        System.out.println("DOOR IS DOWN");
    }

    public void stop() {
        System.out.println("DOOR IS STOP");
    }

    public void lightOn() {
        System.out.println("GARAGE'S LIGHT IS ON");
    }

    public void lightOff() {
        System.out.println("GARAGE'S LIGHT IS OFF");
    }
}
