package com.wl.pluto.bridge;

public abstract class Computer {
    IBrand mBrand;

    public Computer(IBrand brand) {
        this.mBrand = brand;
    }

    public abstract void display();
}
