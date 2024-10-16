package org.example;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @program: myDemo
 * @description: 数据的管道传输
 * @author: hongda
 * @create: 2024-10-16 13:40
 **/
public class PipedInputStreamExample {
    public static void main(String[] args) throws IOException {
        try(PipedInputStream pipedInputStream = new PipedInputStream();
            PipedOutputStream pipedOutputStream = new PipedOutputStream();){
            pipedInputStream.connect(pipedOutputStream);
            byte[] bytes = {11, 21, 3, 40, 5};
            pipedOutputStream.write(bytes);
            int data = pipedInputStream.read();
            while (data != -1){
                System.out.println(data+" ");
                data = pipedInputStream.read();
            }

        }
    }
}
