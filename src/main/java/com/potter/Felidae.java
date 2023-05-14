package com.potter;

public abstract class Felidae {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Felidae (String name, int age) {
        this.name = name;
        this.age = age;
    }

}
