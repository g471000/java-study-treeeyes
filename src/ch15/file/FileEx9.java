package ch15.file;

import java.io.File;

public class FileEx9 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("USAGE: java FileEx9 DIRECTORY");
            System.exit(0);
        }

        File dir = new File(args[0]);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid Directory");
            System.exit(0);
        }

        File[] list = dir.listFiles();

        for (int i = 0; i < list.length; i++) {
            String fileName = list[i].getName();

            String newFileName = "0000" + fileName;
            newFileName = newFileName.substring(newFileName.length() - 7);
            list[i].renameTo(new File(dir, newFileName));
        }
    }
}
