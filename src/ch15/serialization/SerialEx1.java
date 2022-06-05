package ch15.serialization;

import java.io.*;
import java.util.ArrayList;

public class SerialEx1 {
    public static void main(String[] args) {
        try {
            String fileName = "src/ch15/serialization/UserInfo.ser";
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            ObjectOutputStream out = new ObjectOutputStream(bos);

            UserInfo u1 = new UserInfo("Pikachu", "1234", 30);
            UserInfo u2 = new UserInfo("Raichu", "4321", 26);

            ArrayList<UserInfo> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);

            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            out.close();
            System.out.println("Done with the Serialization.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
