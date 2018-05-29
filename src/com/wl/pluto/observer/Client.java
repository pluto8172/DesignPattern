package com.wl.pluto.observer;

public class Client {

    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer observer1 = new ConcreteObserver1(subject);
        Observer observer2 = new ConcreteObserver2(subject);
        Observer observer3 = new ConcreteObserver3(subject);

        subject.setState(10000);
        subject.notification();


        subject.setState(423400);
        subject.notification();

        subject.unRegister(observer1);
        subject.unRegister(observer2);
        //subject.unRegister(observer3);
        // subject.clear();


        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        subject.setState(5456346);
        subject.notification();


    }
}
