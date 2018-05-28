package com.wl.pluto.strategy;

public class Duck {

    private FlyBehavior flyBehavior;

    public Duck() {
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    //方法注入
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }
}
