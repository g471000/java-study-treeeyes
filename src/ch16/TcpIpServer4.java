package ch16;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import static ch16.TcpIpServer.getTime;

public class TcpIpServer4 implements Runnable {
    ServerSocket serverSocket;
    Thread[] threadArr;

    public static void main(String[] args) {
        TcpIpServer4 server = new TcpIpServer4(5);
        server.start();
    }

    public TcpIpServer4(int num) {
        try {
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + "Server is ready.");

            threadArr = new Thread[num];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        for (int i = 0; i < threadArr.length; i++) {
            threadArr[i] = new Thread(this);
            threadArr[i].start();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(getTime() + " is waiting for the connection request.");

                Socket socket = serverSocket.accept();
                System.out.println(getTime() + " connection request from " + socket.getInetAddress());

                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                dos.writeUTF("[Notice] Test Message1 from Server.");
                System.out.println(getTime() + " sent data.");

                dos.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
