package org.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @program: myDemo
 * @description: 字符串大小写转换
 * @author: hongda
 * @create: 2024-10-15 18:18
 **/
public class ByteArrayDemo {
    public static void main(String[] args) {
        String str = "abc dyi1dwdadkwnfgkjawnkg";
        try (ByteArrayInputStream bais = new ByteArrayInputStream(str.getBytes());
             ByteArrayOutputStream baos = new ByteArrayOutputStream();){
            int c = 0;
            while ((c=bais.read()) != -1){
                baos.write(Character.toUpperCase(c));
            }
            System.out.println(baos);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
