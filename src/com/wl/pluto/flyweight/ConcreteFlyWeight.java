package com.wl.pluto.flyweight;

public class ConcreteFlyWeight implements FlyWeight {

    private String color;

    public ConcreteFlyWeight(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("当前位置：" +coordinate.getX() + " --- " + coordinate.getY());
    }


}
