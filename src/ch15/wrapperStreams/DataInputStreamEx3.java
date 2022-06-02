package ch15.wrapperStreams;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int score = 0;

        try {
            FileInputStream fis = new FileInputStream("src/ch15/wrapperStreams/score.dat");
            DataInputStream dis = new DataInputStream(fis);

            while (true) {
                score = dis.readInt();
                System.out.println(score);
                sum += score;
            }
        } catch (EOFException e) {
            System.out.println("Total score is: " + sum);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}