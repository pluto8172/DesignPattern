package com.wl.pluto.bridge;

public class Client {
    public static void main(String[] args){
        Computer computer = new DeskTop(new LenoveBrand());
        computer.display();
    }
}
