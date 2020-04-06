package strategy_parttern;

import strategy_parttern.behavior.FlyWithWings;
import strategy_parttern.super_class.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'M A MALLARD DUCK");
    }
}
