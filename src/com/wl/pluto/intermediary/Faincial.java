package com.wl.pluto.intermediary;

public class Faincial implements Department {

    private Mediator mediator;

    public Faincial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("faincial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("睡觉睡到自然醒，数钱数到手抽筋");
    }

    @Override
    public void outAction() {
        System.out.println("发钱是最开心的一件事情");
    }
}
