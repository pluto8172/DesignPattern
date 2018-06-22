package com.wl.pluto.factory;

public abstract class ApplicationFactory {

    public abstract IActivity createActivity();

    public abstract IService createService();

    public abstract IContentProvider createContentProvider();

    public abstract IBroadCastReceiver createBroadcastReceiver();
}
