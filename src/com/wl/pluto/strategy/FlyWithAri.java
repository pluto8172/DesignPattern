package com.wl.pluto.strategy;

public class FlyWithAri implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("乘风飞行");
    }
}
