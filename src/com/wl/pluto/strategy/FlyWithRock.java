package com.wl.pluto.strategy;

public class FlyWithRock implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("借助火箭飞");
    }
}
