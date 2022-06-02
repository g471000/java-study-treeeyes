package ch15.systemAndFile;

import java.io.IOException;

public class StandardIOEX1 {
    public static void main(String[] args) {
        try {
            int input = 0;

            while ((input = System.in.read()) != -1) {
                if (input == 9999) {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                System.out.println("input: " + input + ", (char)input: " + (char) input);
            }
        } catch (IOException e) {

        }
    }
}
