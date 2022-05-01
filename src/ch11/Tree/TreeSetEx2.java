package ch11.Tree;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i = 0; i < score.length; i++) {
            set.add(score[i]);
        }

        System.out.println("Smaller than 50: " + set.headSet(50));
        System.out.println("Greater than 50: " + set.tailSet(50));
    }
}
