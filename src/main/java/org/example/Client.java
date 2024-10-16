package org.example;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @program: myDemo
 * @description: BIO的客户端
 * @author: hongda
 * @create: 2024-10-16 15:26
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("helloServer".getBytes());
        outputStream.close();
        socket.close();
    }
}
