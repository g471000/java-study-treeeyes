package ch15.serialization;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerialEx2 {
    public static void main(String[] args) {
        try {
            String fileName = "src/ch15/serialization/UserInfo.ser";
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);

            ObjectInputStream ois = new ObjectInputStream(bis);

            UserInfo u1 = (UserInfo) ois.readObject();
            UserInfo u2 = (UserInfo) ois.readObject();
            ArrayList<UserInfo> list = (ArrayList) ois.readObject();

            System.out.println(u1);
            System.out.println(u2);
            System.out.println(list);
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
