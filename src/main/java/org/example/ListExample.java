package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: myDemo
 * @description: List集合的介绍
 * @author: hongda
 * @create: 2024-10-15 13:16
 **/
public class ListExample {
    public static void main(String[] args) {
        //创建一个List集合
        List<String> list = new ArrayList<>();
        List list1 = new ArrayList<>();

        //添加元素
        list.add("Hello");
        list.add("World");
        list.add("!");

        //输出List集合中的元素
        System.out.println("list中的元素：");
        for (String str : list) {
            System.out.println(str);

        }
        /*
        * 自动扩容
        * */
    }
}
