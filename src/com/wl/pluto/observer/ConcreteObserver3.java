package com.wl.pluto.observer;

public class ConcreteObserver3 extends Observer {


    public ConcreteObserver3(Subject subject) {
        subject.register(this);
    }

    @Override
    public void update(int state) {
        System.out.println("ConcreteObserver3 " + state);
    }
}
