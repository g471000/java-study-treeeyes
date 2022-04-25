package ch09.strings;

import java.io.UnsupportedEncodingException;
import java.util.StringJoiner;

public class StringGetBytes {
    public static void main(String[] args) throws Exception {
        String str = "천";

        byte[] bArr = str.getBytes("UTF-8");
        byte[] bArr2 = str.getBytes("CP949");

        System.out.println("UTF-8: " + joinByteArray(bArr));
        System.out.println("CP949: " + joinByteArray(bArr2));

        System.out.println("UTF-8: " + new String(bArr, "UTF-8"));
        System.out.println("CP949: " + new String(bArr2, "CP949"));

    }

    static String joinByteArray(byte[] bArr) {
        StringJoiner sj = new StringJoiner(":", "[", "]");

        for (byte b : bArr) {
            sj.add(String.format("%02X", b));
        }

        return sj.toString();
    }
}

