package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @program: myDemo
 * @description: 对象序列化到文件data.obj中，再对文件反序列化到对象
 * @author: hongda
 * @create: 2024-10-16 10:56
 **/
public class ObjectSerializationDemo {

    static String ObJECT_FILENAME = "data.obj";

    public static void main(String[] args) {
        //将对象序列化
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ObJECT_FILENAME));){
            oos.writeObject(new Person("zhangsan",12));
        }catch (Exception e){
            e.printStackTrace();
        }

        //从文件反序列化出对象
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ObJECT_FILENAME));){
            Person person = (Person) ois.readObject();
            System.out.println(person);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static class Person implements java.io.Serializable{
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString(){
            return "Person [name=]"+name+",age="+age+"]";
        }
    }
}
