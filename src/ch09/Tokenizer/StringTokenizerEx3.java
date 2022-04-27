package ch09.Tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx3 {
    public static void main(String[] args) {
        String source = "1,Pikachu,100,100,100|2,Raichu,95,80,90|3,Pichu,80,90,90";
        StringTokenizer st = new StringTokenizer(source, "|");

        while (st.hasMoreTokens()) {
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
            while (st2.hasMoreTokens()) {
                System.out.println(st2.nextToken());
            }
            System.out.println("-----");
        }
    }
}
