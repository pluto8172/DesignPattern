package com.wl.pluto.factory;

public class YBHApplicationFactory extends ApplicationFactory {
    @Override
    public IActivity createActivity() {
        return new YBHActivity();
    }

    @Override
    public IService createService() {
        return new YBHService();
    }

    @Override
    public IContentProvider createContentProvider() {
        return new YBHContentProvider();
    }

    @Override
    public IBroadCastReceiver createBroadcastReceiver() {
        return new YBHBroadcastReceiver();
    }
}
