package org.example;

public class Demo {
    String name;
    int age;
    String gender;

//    public demo(String name, int age, String gender){
//        this.name = name;
//        this.age = age;
//        this.gender =gender;
//    }

    void study(){
        System.out.println("Student"+name+"is studying.");
    }

    void play(){
        System.out.println("Study"+name+"is playing.");
    }
    public int CounterUtil(int a,int b){
        if (a > b){
            return a;
        }
        return b;
    }

}

class Students extends Demo{

}
