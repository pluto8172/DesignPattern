package com.wl.pluto.intermediary;

public class Development implements Department {

    private Mediator mediator;

    public Development(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("认真撸代码， ");
    }

    @Override
    public void outAction() {
        System.out.println("只有钱才能让我快乐！");
        mediator.command("faincial");
    }
}
