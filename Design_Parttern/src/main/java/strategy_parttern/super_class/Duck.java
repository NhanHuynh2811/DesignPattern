package strategy_parttern.super_class;

import strategy_parttern.behavior.FlyBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks ﬂoat, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
