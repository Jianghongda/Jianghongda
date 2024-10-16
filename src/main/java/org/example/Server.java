package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: myDemo
 * @description: BIO的服务端
 * @author: hongda
 * @create: 2024-10-16 15:22
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        //这里会一直处于堵塞状态
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
