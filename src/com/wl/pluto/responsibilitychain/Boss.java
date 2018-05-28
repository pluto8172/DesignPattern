package com.wl.pluto.responsibilitychain;

public class Boss extends Leader {


    public Boss(String name) {
        this.name = name;
    }

    @Override
    public void handleRequest(LeveRequest request) {
        if (request.getLeveDays() < 30) {
            System.out.println("员工： " + request.getName() + "因为" + request.getReason() + "原因， 请假 " + request.getLeveDays() + "天");
            System.out.println("老板 " + this.name + "审核通过");
        } else {
            System.out.println("你可以不用再来了");
        }
    }
}
