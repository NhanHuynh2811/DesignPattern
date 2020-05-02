package command_pattern.invoker;

public class CeilingFan {
    public static final  int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public CeilingFan(String location) {
        this.speed = OFF;
        this.location = location;
    }

    int speed;
    String location;

    public void hight() {
        speed = HIGH;
        System.out.println("Living room ceiling fan is on High");
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public void off() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
