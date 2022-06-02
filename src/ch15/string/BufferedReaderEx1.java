package ch15.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/ch15/string/BufferedReaderEx1.java");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            int index = 0;
            while ((line = br.readLine()) != null) {
                if (line.indexOf(";") == -1) {
                    System.out.println(index++ + ":" + line);
                }
            }
            br.close();
        } catch (IOException e) {

        }
    }
}
