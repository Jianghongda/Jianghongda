package org.example;

public class Test extends Person{
    public static void main(String args[]){
        Test t = new Test();
        t.name = "Tom";
        t.setAge(25);
        //t.setSalary(10000.0); //不能调用
        t.getInfo();
    }
}
