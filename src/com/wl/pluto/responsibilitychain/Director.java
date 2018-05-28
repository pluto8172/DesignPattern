package com.wl.pluto.responsibilitychain;

public class Director extends Leader {


    public Director(String name) {
        this.name = name;
    }

    @Override
    public void handleRequest(LeveRequest request) {
        if (request.getLeveDays() < 3) {
            System.out.println("员工： " + request.getName() + "因为" + request.getReason() + "原因， 请假 " + request.getLeveDays() + "天");
            System.out.println("主管 " + this.name + "审核通过");
        } else {
            if (nextLeader != null) {
                nextLeader.handleRequest(request);
            }
        }
    }
}
