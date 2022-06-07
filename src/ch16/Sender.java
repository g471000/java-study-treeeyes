package ch16;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread {
    Socket socket;
    DataOutputStream out;
    String name;

    Sender(Socket socket) {
        this.socket = socket;
        try {
            out = new DataOutputStream(socket.getOutputStream());
            name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (out != null) {
            try {
                out.writeUTF(name + scanner.nextLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
