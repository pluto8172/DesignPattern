package com.wl.pluto.singleton;

/**
 * 懒汉式单例模式
 *
 * 线程不安全，可以加锁保证线程安全，但是加锁后调用效率就不高了。可以延时加载
 *
 * 如果初始化话的时候，需要额外的参数，也需要这样的初始化
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}
