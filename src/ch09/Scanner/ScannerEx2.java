package ch09.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("data.txt"));
        int sum = 0;
        int cnt = 0;

        while (scanner.hasNextInt()) {
            int curr = scanner.nextInt();
            System.out.println("found: " + curr);
            sum += curr;
            cnt++;
        }

        System.out.println("sum = " + sum);
        System.out.println("average = " + (double) sum / cnt);
    }
}
