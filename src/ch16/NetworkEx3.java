package ch16;

import java.net.URL;
import java.net.URLConnection;

public class NetworkEx3 {
    public static void main(String[] args) {
        URL url = null;
        String address = "https://pnation.com/data/file/artists/" +
                "2038871555_ein9LvtZ_ebff7adf9b0fbf6dd545b85bf3408ea8d5bbb829.jpg";

        try {
            url = new URL(address);
            URLConnection conn = url.openConnection();

            System.out.println(conn.toString());
            System.out.println(conn.getAllowUserInteraction());
            System.out.println(conn.getConnectTimeout());
            System.out.println();

            System.out.println(conn.getContent());
            System.out.println(conn.getContentEncoding());
            System.out.println(conn.getContentLength());
            System.out.println(conn.getContentType());
            System.out.println();

            System.out.println(conn.getDate());
            System.out.println(conn.getDoInput());
            System.out.println(conn.getDoOutput());
            System.out.println(conn.getExpiration());
            System.out.println(conn.getHeaderFields());
            System.out.println();

            System.out.println(conn.getIfModifiedSince());
            System.out.println(conn.getLastModified());
            System.out.println(conn.getReadTimeout());
            System.out.println(conn.getURL());
            System.out.println(conn.getUseCaches());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
