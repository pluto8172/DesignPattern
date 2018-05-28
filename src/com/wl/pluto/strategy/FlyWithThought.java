package com.wl.pluto.strategy;

public class FlyWithThought implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("靠意念飞行");
    }
}
