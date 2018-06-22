package com.wl.pluto.factory;

public class FactoryClient {

    public static void main(String[] args){
        YBHApp app = new YBHApp(new YBHApplicationFactory());
        app.onCreate();
    }
}
