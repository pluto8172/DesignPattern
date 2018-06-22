package com.wl.pluto.factory;

public class YBHApp {

    private IActivity mActivity;
    private IService mService;
    private IContentProvider mContentProvider;
    private IBroadCastReceiver mBroadcastReceiver;


    private ApplicationFactory mFactory;

    public YBHApp(ApplicationFactory factory) {
        mFactory = factory;
        init();
    }

    private void init() {
        this.mActivity = mFactory.createActivity();
        this.mService = mFactory.createService();
        this.mContentProvider = mFactory.createContentProvider();
        this.mBroadcastReceiver = mFactory.createBroadcastReceiver();
    }

    public void onCreate() {
        mActivity.onCreate();
        mService.onCreate();
        mBroadcastReceiver.onReceiver();
        mContentProvider.query();
    }
}
