package com.potter;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats("Kitty", 5);
        Cats cat2 = new Cats("Kat", 2);
        Dogs dog = new Dogs("Puppy", 10);
        dog.isOld();
        cat.isOld();
        cat2.isOld();

        Meow[] meows = new Meow[]{cat, cat2};
        MeowGenerator.getMeow(meows);
    }
}
