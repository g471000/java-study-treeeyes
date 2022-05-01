package ch11.Hash;

import java.util.*;

public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        Enumeration e = prop.propertyNames();

        while (e.hasMoreElements()) {
            String elements = (String) e.nextElement();
            System.out.println(elements + " = " + prop.getProperty(elements));
        }
        System.out.println();

        prop.setProperty("size", "20");
        System.out.println("size = " + prop.getProperty("size"));
        System.out.println("capacity = " + prop.getProperty("capacity", "20"));
        System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));
        System.out.println();

        System.out.print("System.out.println(prop): ");
        System.out.println(prop);
        System.out.println();

        System.out.println("prob.list(System.out)");
        prop.list(System.out);
    }
}
