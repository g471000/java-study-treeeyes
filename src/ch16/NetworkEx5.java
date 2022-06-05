package ch16;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class NetworkEx5 {
    public static void main(String[] args) {
        String address = "https://github.com/castello/javajungsuk3/blob/master/java_jungsuk3e_src_20170601.zip";
        URL url;
        InputStream in;
        FileOutputStream out;

        int ch = 0;

        try {
            url = new URL(address);
            in = url.openStream();
            out = new FileOutputStream("java_jungsuk3e_src_20170601.zip");

            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
