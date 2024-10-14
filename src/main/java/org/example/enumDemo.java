package org.example;

public class enumDemo {
    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }



    //switch语句
    public static void main(String args[]){

        Season season = Season.SUMMER;

        switch (season){
            case SPRING -> System.out.println("Spring");
            case SUMMER -> System.out.println("Summer");
            case FALL -> System.out.println("Fall");
            case WINTER -> System.out.println("Winter");
            case null -> System.out.println("null");

        }
    }
}
