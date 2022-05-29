package ch15.byteStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileViewer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/ch15/byteStreams/FileViewer.java");
        int data = 0;

        while ((data = fis.read()) != -1) {
           char c = (char) data;
            System.out.print(c);
        }
    }
}
