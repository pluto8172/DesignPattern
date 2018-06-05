package com.wl.pluto.flyweight;


/**
 * 享元模式的接口
 */
public interface FlyWeight {

    String getColor();

    void display(Coordinate coordinate);
}
