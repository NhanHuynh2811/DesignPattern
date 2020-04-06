package strategy_parttern.behavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("CAN'T FLY");
    }
}
