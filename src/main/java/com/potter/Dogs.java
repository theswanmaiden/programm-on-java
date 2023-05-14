package com.potter;

public class Dogs extends Canidae implements Bark{
    private String breed;
    public Dogs(String name, int age) {
        super(name, age);
    }

    @Override
    public String voice() {
        return "Гав";
    }

    public void isOld() {
        if (age > 1) {
            System.out.printf("%s уже не щеночек \n", name);
        } else {
            System.out.printf("%s еще щеночек \n", name);
        }
    }
}
