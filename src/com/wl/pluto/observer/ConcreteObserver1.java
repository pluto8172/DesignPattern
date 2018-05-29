package com.wl.pluto.observer;

import java.util.Objects;

public class ConcreteObserver1 extends Observer {

    private Subject mSubject;

    public ConcreteObserver1(Subject subject) {
        mSubject = subject;
        mSubject.register(this);
    }

    @Override
    public void update(int state) {
        System.out.println("ConcreteObserver1 " + state);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcreteObserver1 that = (ConcreteObserver1) o;
        return Objects.equals(mSubject, that.mSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mSubject);
    }
}
