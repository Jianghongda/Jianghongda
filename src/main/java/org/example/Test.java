package org.example;

import java.util.HashMap;

public class Test extends Person{
    public static void main(String args[]){
        Test t = new Test();
        t.name = "Tom";
        t.setAge(25);
        //t.setSalary(10000.0); //不能调用
        t.getInfo();
        int[] myArray = new int[5];
        for (int i =0; i <5; i++){
            myArray[i] = 10*(i+1);
        }
        for (int i =0; i <5; i++){
            System.out.println(myArray[i]);
        }

        String[][] students = {
                {"张三", "18", "男"},
                {"李四", "20", "女"},
                {"王五", "19", "男"},
                {"赵六", "17", "女"},
                {"赵七", "22", "男"}
        };
        for (int i = 0; i < students.length; i++) {
            System.out.println("姓名：" + students[i][0] + "，年龄：" + students[i][1] + "，性别：" + students[i][2]);
        }
// 使用break终止循环
        for (int i=0; i<10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

// 使用continue跳过循环
        for (int i=0; i<10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        for(int i =1; i<=10; i++){
            for (int j=10; j>0;j--){
                if(j>i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
        HashMap<String, String> map = new HashMap<String, String>();
        //put(key,value):添加元素
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");


    }
}
