package ch15.wrapperStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileConversion {
    public static void main(String[] args) {
        try {
            String fileName = "src/ch15/wrapperStreams/FileConversion.java";
            String convertName = "src/ch15/wrapperStreams/convert.txt";

            FileReader fr = new FileReader(fileName);
            FileWriter fw = new FileWriter(convertName);

            int data = 0;
            while ((data = fr.read()) != -1) {
                if (data != '\t' && data != '\n' && data != ' ' && data != '\r') {
                    fw.write(data);
                }
            }

            fr.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
