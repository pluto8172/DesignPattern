package com.wl.pluto.responsibilitychain;

public class LeveRequest {

    private String name;
    private int leveDays;
    private String reason;

    public LeveRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeveDays() {
        return leveDays;
    }

    public void setLeveDays(int leveDays) {
        this.leveDays = leveDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
