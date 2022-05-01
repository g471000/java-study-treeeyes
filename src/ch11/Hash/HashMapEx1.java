package ch11.Hash;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("24", "pikachu");
        map.put("4", "charmander");
        map.put("151", "mew");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter number and name.");
            System.out.print("Number: ");
            String number = s.nextLine().trim();

            System.out.print("Name: ");
            String name = s.nextLine().trim();
            System.out.println();

            if (!map.containsKey(number)) {
                System.out.println("The number of the pokemon does not exist. Please try again.");
                continue;
            }

            if (!(map.get(number).equals(name))) {
                System.out.println("The name does not match with the number. Please try again.");
            } else {
                System.out.println("name and the number matches!");
                break;
            }
        }
    }
}
