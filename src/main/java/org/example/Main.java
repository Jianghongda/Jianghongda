package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Demo student = new Demo();
        student.study();
        student.play();
        int result = student.CounterUtil(123, 23);
        System.out.println(result);
        Students students = new Students();
        students.play();
    }

}