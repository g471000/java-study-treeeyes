package ch11.Hash;

import java.io.*;
import java.util.*;

public class PropertiesEx2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : Java PropertiesEx2 INPUTFILENAME");
            System.exit(0);
        }

        Properties prop = new Properties();
        String input = args[0];

        try {
            prop.load(new FileInputStream(input));
        } catch (IOException e) {
            System.out.println("Cannot find the filename: " + input);
            System.exit(0);
        }

        String name = prop.getProperty("name");
        String[] data = prop.getProperty("data").split(",");
        int max = 0, min = 0, sum = 0;

        for (int i = 0; i < data.length; i++) {
            int intValue = Integer.parseInt(data[i]);

            if (i == 0) {
                max = intValue;
                min = intValue;
            } else {
                if (max < intValue) {
                    max = intValue;
                } else if (min > intValue) {
                    min = intValue;
                }
            }
            sum += intValue;
        }

        System.out.println("Name: " + name);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + (sum * 100.0 / data.length) / 100);
    }
}
