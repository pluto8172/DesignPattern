package com.wl.pluto.moment;

public class Moment {

    private String name;
    private String descripition;
    private int age;

    public Moment(CurrentState state){
        this.name = state.getName();
        this.age = state.getAge();
        this.descripition = state.getDescripition();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
