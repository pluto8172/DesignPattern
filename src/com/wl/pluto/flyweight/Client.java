package com.wl.pluto.flyweight;

public class Client {

    public static void main(String[] args){
        FlyWeight weight1 = FlyWeightFactory.createFlyWeight("白色棋子");
        FlyWeight weight2 = FlyWeightFactory.createFlyWeight("白色棋子");

        weight1.display(new Coordinate(10,10));

        weight2.display(new Coordinate(324,534));
    }
}
