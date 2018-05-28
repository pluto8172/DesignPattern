package com.wl.pluto.responsibilitychain;

public class Client {

    public static void main(String[] args){
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new Boss("王五");
        a.setNextLeader(b);
        b.setNextLeader(c);

        LeveRequest request = new LeveRequest("王二麻子");
        request.setLeveDays(15);
        request.setReason("去相亲");

        a.handleRequest(request);
    }



}
