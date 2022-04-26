package ch09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

import static java.util.Objects.*;

public class ObjectTest {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D_2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        print2DStrArray("str2D", str2D);
        print2DStrArray("str2D_2", str2D_2);

        System.out.println(Objects.equals(str2D, str2D_2));
        System.out.println(Objects.deepEquals(str2D, str2D_2));
        System.out.println(isNull(null));
        System.out.println(nonNull(null));
        System.out.println(Objects.hashCode(null));
        System.out.println(Objects.toString(null));
        System.out.println(Objects.toString(null, ""));

        Comparator c = String.CASE_INSENSITIVE_ORDER;

        System.out.println(compare("aa", "bb", c));
        System.out.println(compare("bb", "aa", c));
        System.out.println(compare("ab", "AB", c));
    }

    static void print2DStrArray(String name, String[][] arr) {
        System.out.print(name + " = {");
        for (String[] tmp : arr) {
            System.out.print(Arrays.toString(tmp));
        }
        System.out.println("}");
    }
}
