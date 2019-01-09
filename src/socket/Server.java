package socket;

/*
 * Created by renhongjiang on 2019/1/8.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/8 19:19
 */
public class Server extends Thread {

    private ServerSocket serverSocket;


    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("等待连接。。。端口号： " + serverSocket.getLocalPort() + "...");
            Socket socket = null;
            try {
                socket = serverSocket.accept();
                System.out.println("远程主机地址： " + socket.getRemoteSocketAddress());
                DataInputStream dis = new DataInputStream(socket.getInputStream());
                System.out.println("---" + dis.readUTF());
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeUTF("谢谢连接。。。" + socket.getLocalSocketAddress() + "\nGoodbye!");
                socket.close();

            } catch (SocketTimeoutException e) {
                System.out.println("Socket timed out...");
                break;
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }

        }
    }

    public static void main(String[] args) {
        int port = 8081;
        Thread t = null;
        try {
            t = new Server(port);
            t.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}