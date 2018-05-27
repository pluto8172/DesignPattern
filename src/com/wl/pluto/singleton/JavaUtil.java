package com.wl.pluto.singleton;

/**
 * 饿汉式单例模式
 *
 * 线程安全，调用效率高，但是不能延迟加载，
 * 不需要延迟加载的推荐使用，但是前提条件是初始化的时候不需要额外的参数
 *
 */
public class JavaUtil {

    private static JavaUtil ourInstance = new JavaUtil();

    public static JavaUtil getInstance() {
        return ourInstance;
    }

    private JavaUtil() {
    }
}
