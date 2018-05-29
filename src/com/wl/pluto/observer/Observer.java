package com.wl.pluto.observer;

/**
 * 这里用接口，在subject中的unRegister方法中，无法删除其中的元素，这和泛型的擦除类型有关，所以只能用抽象类
 */
public abstract class Observer {

    public abstract void update(int state);
}
