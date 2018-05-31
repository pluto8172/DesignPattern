package com.wl.pluto.template;

public abstract class BaseActivity {

    /**
     * 需要子类实现的
     */
    public abstract void templateMethod();

    public void method1() {
        System.out.println("步骤1");
    }

    public void method2() {
        System.out.println("步骤2");
    }

    public void method3() {
        System.out.println("步骤3");
    }

    public void method4() {
        System.out.println("步骤4");
    }

    /**
     * 只能调用，不能修改，这里设计了一个框架，整个流程都需要在这里固定好。
     * 子类只需要实现相应的代码就可以安装框架设计好的流程执行
     */
    public final void function() {

        templateMethod();
        method1();
        method2();
        method3();
        method4();

    }
}
