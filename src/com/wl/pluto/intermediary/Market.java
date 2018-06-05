package com.wl.pluto.intermediary;

public class Market implements Department {

    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("没有卖不出去的产品，只有卖不出产品的人， 我是最胖的");
    }

    @Override
    public void outAction() {
        System.out.println("不吃饭，不睡觉，一心只想赚钞票");
    }
}
