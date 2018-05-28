package com.wl.pluto.strategy;

public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("用翅膀飞");
    }
}
