package org.example;

import java.io.*;

/**
 * @program: myDemo
 * @description: 读取和写入基本类型的数据
 * @author: hongda
 * @create: 2024-10-16 10:39
 **/
public class DataStreamDemo {
    public static void main(String[] args) {
        String filename = "data.txt";
        try(
                FileOutputStream fos = new FileOutputStream(filename);
                DataOutputStream dos = new DataOutputStream(fos);
                FileInputStream fis = new FileInputStream(filename);
                DataInputStream dis = new DataInputStream(fis);
                ){
            //写入一些字符
            dos.writeUTF("hello world");
            //写入一些整型数据
            dos.writeInt(123);
            dos.writeFloat(123.45f);
            dos.writeBoolean(true);
            //读取字符
            String str = dis.readUTF();
            //读取整型数据
            int i = dis.readInt();
            float f = dis.readFloat();
            boolean b = dis.readBoolean();
            //打印读取的数据
            System.out.println(str);
            System.out.println(i);
            System.out.println(f);
            System.out.println(b);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
