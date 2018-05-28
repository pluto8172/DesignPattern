package com.wl.pluto.strategy;

public class Client {

    public static void main(String[] args){
        Duck duck = new Duck();
        duck.setFlyBehavior(new FlyWithThought());
        duck.fly();

        duck.setFlyBehavior(new FlyWithWing());
        duck.fly();
    }
}
