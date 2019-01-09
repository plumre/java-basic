package socket;

/*
 * Created by renhongjiang on 2019/1/8.
 */

import java.io.*;
import java.net.Socket;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/8 19:11
 */
public class Client {
    public static void main(String[] args) {
        String serverName = "localhost";
        int port = 8081;

        System.out.println("连接主机： " + serverName + ", 端口： " + port);
        try {
            Socket socket = new Socket(serverName, port);
            System.out.println("远程地址： " + socket.getRemoteSocketAddress());
            OutputStream outToServer = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(outToServer);
            dos.writeUTF("Hello form " + socket.getLocalSocketAddress());

            InputStream inFromServer = socket.getInputStream();
            DataInputStream dis = new DataInputStream(inFromServer);
            System.out.println("response from server: " + dis.readUTF());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}