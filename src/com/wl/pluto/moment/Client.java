package com.wl.pluto.moment;

public class Client {

    public static void main(String[] args){

        CurrentState state = new CurrentState("张三", "吃饭", 1245);

        TakeCare takeCare = new TakeCare();
        takeCare.setMoment(state.save());
        System.out.println(state.toString());

        state.setDescripition("睡觉");
        state.setAge(446450);
        System.out.println(state.toString());


        System.out.println("回到上一步");
        state.undo(takeCare.getMoment());
        System.out.println(state.toString());

    }
}
