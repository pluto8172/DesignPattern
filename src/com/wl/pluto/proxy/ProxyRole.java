package com.wl.pluto.proxy;

public class ProxyRole implements IProxy {


    private RealRole realRole;

    public ProxyRole(RealRole realRole) {
        this.realRole = realRole;
    }

    @Override
    public void play() {
        System.out.println("我是渣渣辉的代理人，有什么事情可以先找我！");
        realRole.play();
        System.out.println("渣渣辉很忙的，剩下的事情交给我处理");
    }
}
