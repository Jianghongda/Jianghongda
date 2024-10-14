package org.example;

import java.util.Date;
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
        //get(key):获取元素
        String value = map.get("1");
        System.out.println(value);
        //remove(key):删除元素
        map.remove("1");
        //containsKey(key):判断是否包含某个key
        map.put("1", "One");
        if (map.containsKey("1")) {
            System.out.println("map contains key 1");
        }

        //Hashtable是一种线程安全的HashMap实现，可以让多个线程同时访问哈希表
        //LinkedHashMap可以使用链表来维护记录的插入顺序，从而提供有序的访问
        //TreeMap可以按照排序键来存储和访问记录

        Date date = new Date();
        System.out.println(date);//输出的是当前时间
        System.out.println(date.getTime());//输出的是当前时间戳
        System.out.println(date.getDay());//输出的是当前属于星期几
        System.out.println(date.getMonth());//输出的是当前是几月，注意jdk里面的月份是从0开始计算的
        System.out.println(date.getYear()+1900);//输出的是当前的年，注意jdk里面的年是从1900年开始累积的，2024年输出的是124
        System.out.println(date.getHours());//输出的是当前小时数
        System.out.println(date.getMinutes());//输出的是当前分钟数
        System.out.println(date.getSeconds());//输出的是当前秒数

    }
}
