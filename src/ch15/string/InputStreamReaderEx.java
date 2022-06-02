package ch15.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
    public static void main(String[] args) {
        String line = "";

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("OS Incoding: " + isr.getEncoding());

            do {
                System.out.print("Insert Sentense (q for quit): ");
                line = br.readLine();
                System.out.println("Entered " + line);
            } while (!line.equalsIgnoreCase("q"));

            br.close();
            System.out.println("Exiting Program...");
        } catch (IOException e) {

        }
    }
}
