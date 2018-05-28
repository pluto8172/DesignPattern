package com.wl.pluto.responsibilitychain;

public class Manager extends Leader {

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void handleRequest(LeveRequest request) {
        if(request.getLeveDays()<15){
            System.out.println("员工： " + request.getName() + "因为" + request.getReason() + "原因， 请假 "+ request.getLeveDays()+"天" );
            System.out.println("经理 "+this.name+"审核通过");
        }else {
            if(nextLeader!= null){
                nextLeader.handleRequest(request);
            }
        }
    }
}
