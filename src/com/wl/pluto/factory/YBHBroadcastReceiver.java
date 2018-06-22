package com.wl.pluto.factory;

public class YBHBroadcastReceiver implements IBroadCastReceiver {
    @Override
    public void onReceiver() {
        System.out.println("创建BroadCastReceiver");
    }
}
