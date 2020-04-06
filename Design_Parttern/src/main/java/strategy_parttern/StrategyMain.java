package strategy_parttern;

import strategy_parttern.behavior.FlyNoWay;
import strategy_parttern.super_class.Duck;

public class StrategyMain {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();
    }
}
