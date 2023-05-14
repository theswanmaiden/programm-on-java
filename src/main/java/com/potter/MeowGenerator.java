package com.potter;

public class MeowGenerator {

    public static void getMeow(Meow[] meows){
        for (int i = 0; i < meows.length; i++) {
            System.out.println(meows[i].voice());
        }
    }
}
