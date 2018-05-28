package com.wl.pluto.responsibilitychain;

public abstract class Leader {

    String name;
    Leader nextLeader;


    public abstract void handleRequest(LeveRequest request);

    public String getName() {
        return name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }
}
