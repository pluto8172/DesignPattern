package com.wl.pluto.moment;

public class CurrentState {

    private String name;
    private String descripition;
    private int age;


    public CurrentState(String name, String descripition, int age) {
        this.name = name;
        this.descripition = descripition;
        this.age = age;
    }

    public Moment save() {
        return new Moment(this);
    }

    public void undo(Moment moment){
        this.name = moment.getName();
        this.descripition = moment.getDescripition();
        this.age = moment.getAge();
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

    @Override
    public String toString() {
        return "CurrentState{" +
                "name='" + name + '\'' +
                ", descripition='" + descripition + '\'' +
                ", age=" + age +
                '}';
    }
}
