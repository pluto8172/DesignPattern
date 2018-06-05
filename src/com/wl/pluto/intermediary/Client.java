package com.wl.pluto.intermediary;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new Boss();

        Department dev = new Development(mediator);
        Department market = new Market(mediator);
        Department fain = new Faincial(mediator);
        dev.outAction();
    }
}
