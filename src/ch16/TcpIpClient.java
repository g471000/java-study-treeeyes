package ch16;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient {
    public static void main(String[] args) {
        try {
            String serverIp = "127.0.0.1";

            System.out.println("Connecting to Server. Server IP: " + serverIp);

            Socket socket = new Socket(serverIp, 7777);

            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            System.out.println("Received from server: " + dis.readUTF());
            System.out.println("Disconnecting from the server.");

            dis.close();
            socket.close();
            System.out.println("Disconnected from the server.");
        } catch (ConnectException connectException) {
            connectException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
