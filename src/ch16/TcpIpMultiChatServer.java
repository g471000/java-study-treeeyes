package ch16;

import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpIpMultiChatServer {

    public static void main(String[] args) {
        new TcpIpMultiChatServer().start();
    }

   HashMap clients;

    TcpIpMultiChatServer() {
        clients = new HashMap();
        Collections.synchronizedMap(clients);
    }

    public void start() {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("Sever is now started");

            while (true) {
                socket = serverSocket.accept();
                System.out.println("Connected from " + getSocketInfo(socket));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void sendToAll(String msg) {
        Iterator it = clients.keySet().iterator();

        while (it.hasNext()) {
            try {
                DataOutputStream out = (DataOutputStream) clients.get(it.next());
                out.writeUTF(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getSocketInfo(Socket socket) {
        return "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
    }


    class ServerReceiver extends Thread {
        Socket socket;
        DataInputStream in;
        DataOutputStream out;

        ServerReceiver(Socket socket) {
            this.socket = socket;
            try {
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            String name = null;
            try {
                name = in.readUTF();
                sendToAll("#" + name + " is entered the room.");

                clients.put(name, out);
                System.out.println("Now " + clients.size() + " people are in the server.");

                while (in != null) {
                    sendToAll(in.readUTF());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                sendToAll("#" + name + " just left the room.");
                clients.remove(name);
                System.out.println("Disconnected from " + getSocketInfo(socket));
                System.out.println();
                System.out.println("Now " + clients.size() + " people are in the server.");
            }
        }

        private void sendToAll(String s) {
        }
    }
}

