package ch15.file;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File f = new File("src/ch15/file/FileEx1.java");
        String fileName = f.getName();
        int pos = fileName.lastIndexOf(".");

        System.out.println("File Name without path: " + f.getName());
        System.out.println("File Name without extension: " + fileName.substring(0, pos));
        System.out.println("Extension: " + fileName.substring(pos + 1));
        System.out.println();

        System.out.println("File Name with path: " + f.getPath());
        System.out.println("File's absolute path: " + f.getAbsolutePath());
        System.out.println("File's canonical path: " + f.getCanonicalPath());
        System.out.println("File's directory: " + f.getParent());
        System.out.println();

        System.out.println("File.pathSeparator - " + File.pathSeparator);
        System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);
        System.out.println();

        System.out.println("File.separator - " + File.separator);
        System.out.println("File.separatorChar - " + File.separatorChar);
        System.out.println();

        System.out.println("user.dir = " + System.getProperty("user.dir"));
        System.out.println("sun.boot.class.path = " + System.getProperty("sun.boot.class.path"));
    }
}
