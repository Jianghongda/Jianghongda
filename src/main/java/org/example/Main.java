package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Demo student = new Demo();
//        student.study();
//        student.play();
//        int result = student.CounterUtil(123, 23);
//        System.out.println(result);
//        Students students = new Students();
//        students.play();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入第一个数字：");
//        int a = scanner.nextInt();
//        System.out.println("请输入第二个数字：");
//        int b = scanner.nextInt();
//        int c = a + b;
//        System.out.println("a + b = "+c);
        Person p = new Person();
        p.name = "John";
        p.setAge(20);
        //这里的setSalary是私有方法，外部类无法调用
        //p.setSalary(5000.0);
        p.getInfo();
    }

}
