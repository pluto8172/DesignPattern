package com.wl.pluto.proxy;

public class Client {

    public static void main(String[] args){

        IProxy proxy = new ProxyRole(new RealRole());
        proxy.play();
    }
}
