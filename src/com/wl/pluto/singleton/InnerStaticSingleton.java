package com.wl.pluto.singleton;

/**
 * 静态内部类实现的单例模式
 *
 * 综合了这种有点，线程安全，调用效率高，而且可以延时加载
 */
public class InnerStaticSingleton {

    private InnerStaticSingleton(){

    }

    private static class InnerInstance{
       static InnerStaticSingleton instance = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance(){
        return InnerInstance.instance;
    }
}
