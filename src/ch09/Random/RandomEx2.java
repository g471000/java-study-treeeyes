package ch09.Random;

import java.util.Random;

public class RandomEx2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] number = new int[100];
        int[] counter = new int[10];

        for (int i = 0; i < number.length; i++) {
            number[i] = r.nextInt(10);
            System.out.print(number[i]);
        }
        System.out.println();

        for (int i = 0; i < number.length; i++) {
            counter[number[i]]++;
        }

        for (int i = 0; i < counter.length; i++) {
            System.out.println("number of " + i + ": " + printGraph('#', counter[i]) + " " + counter[i]);
        }
    }

    public static String printGraph(char ch, int value) {
        char[] bar = new char[value];

        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        }
        return new String(bar);
    }
}
