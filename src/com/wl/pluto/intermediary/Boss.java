package com.wl.pluto.intermediary;

import java.util.HashMap;
import java.util.Map;

public class Boss implements Mediator {

    private Map<String, Department> map = new HashMap<>();

    @Override
    public void register(String name, Department department) {
        map.put(name, department);
    }

    @Override
    public void command(String name) {
        map.get(name).outAction();
    }
}
