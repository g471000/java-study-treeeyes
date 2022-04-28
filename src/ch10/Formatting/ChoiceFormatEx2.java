package ch10.Formatting;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {
    public static void main(String[] args) {
        String pattern = "50#F|60#D|70#C|80<B|90#A";
        int[] scores = {100, 95, 80, 70, 52, 60, 70, 93};

        ChoiceFormat cf = new ChoiceFormat(pattern);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + ": " + cf.format(scores[i]));
        }
    }
}
