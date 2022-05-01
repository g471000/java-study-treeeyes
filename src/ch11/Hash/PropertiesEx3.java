package ch11.Hash;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx3 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        String output = "Properties Example";
        try {
            prop.store(new FileOutputStream("outputs/output.txt"), output);
            prop.storeToXML(new FileOutputStream("outputs/output.xml"), output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
