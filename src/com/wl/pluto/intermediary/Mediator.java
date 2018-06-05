package com.wl.pluto.intermediary;

public interface Mediator {

    void register(String name, Department department);

    void command(String name);
}
