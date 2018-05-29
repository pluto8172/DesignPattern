package com.wl.pluto.observer;

public class ConcreteObserver2 extends Observer {


    public ConcreteObserver2(Subject subject) {
        subject.register(this);
    }

    @Override
    public void update(int state) {

        System.out.println("ConcreteObserver2 " + state);
    }


}
