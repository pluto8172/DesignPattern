package com.wl.pluto.bridge;

public class DeskTop extends Computer {

    public DeskTop(IBrand brand) {
        super(brand);
    }

    @Override
    public void display() {
        mBrand.show();
        System.out.println("的台式电脑");
    }
}
