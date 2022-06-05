package ch16;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TcpIpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime());
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                System.out.println(getTime() + " waiting connection request...");
                serverSocket.setSoTimeout(5 * 1000);

                Socket socket = serverSocket.accept();
                System.out.println(getTime() + " connection request from " + socket.getInetAddress());

                System.out.println("port: " + socket.getPort());
                System.out.println("local port: " + socket.getLocalPort());

                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                dos.writeUTF("[Notice] Test Message from Server.");
                System.out.println(getTime() + " Message sent.");

                dos.close();
                socket.close();
            } catch (SocketTimeoutException e) {
                System.out.println("Connection request was not came within the time limit. Exiting program...");
                System.exit(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}
