package ch15.systemAndFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx1 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("src/ch15/systemAndFile/test.dat", "rw");
            System.out.println("File pointer location: " + raf.getFilePointer());
            raf.writeInt(100);
            System.out.println("File pointer location: " + raf.getFilePointer());
            raf.writeLong(100L);
            System.out.println("File pointer location: " + raf.getFilePointer());
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
