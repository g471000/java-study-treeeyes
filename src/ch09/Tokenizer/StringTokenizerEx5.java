package ch09.Tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx5 {
    public static void main(String[] args) {
        String data = "100,,,200,300";

        String[] result = data.split(",");
        StringTokenizer st = new StringTokenizer(data, ",");

        int count = 0;
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "|");
            count++;
        }
        System.out.println();
        System.out.println("count: " + count);
        System.out.println();

        count = 0;
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "|");
            count++;
        }
        System.out.println();
        System.out.println("count: " + count);
    }
}
