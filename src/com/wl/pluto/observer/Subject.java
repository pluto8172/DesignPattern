package com.wl.pluto.observer;

import java.util.LinkedList;
import java.util.List;

public class Subject {

    int state;
    List<Observer> observerList = new LinkedList<>();

    public void register(Observer observer) {
        observerList.add(observer);
    }

    public void unRegister(Observer observer) {
        observerList.remove(observer);
    }

    public void notification() {
        for (Observer item : observerList) {
            item.update(state);
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void clear(){
        observerList.clear();
    }
}
