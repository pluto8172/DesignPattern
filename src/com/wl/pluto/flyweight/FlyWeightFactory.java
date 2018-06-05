package com.wl.pluto.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    private static Map<String, FlyWeight> map = new HashMap<>();

    public static FlyWeight createFlyWeight(String color){

        FlyWeight flyWeight = map.get(color);
        if(flyWeight == null){
            flyWeight = new ConcreteFlyWeight("白色棋子");
            map.put(flyWeight.getColor(), flyWeight );
        }
        return flyWeight;
    }
}
