package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: myDemo
 * @description: 字节流输入输出
 * @author: hongda
 * @create: 2024-10-15 14:19
 **/
public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/file/abc.txt");
            FileOutputStream fos = new FileOutputStream("src/file/abc_copy.txt");){
            int len;
            byte[] buf = new byte[1024];
            while ((len = fis.read(buf)) != -1){
                fos.write(buf, 0 ,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
