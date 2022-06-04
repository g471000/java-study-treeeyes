package ch15.file;

import java.io.File;

public class FileEx8 {
    static int deletedFiles = 0;

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("USAGE: java FileEx8 Directory Extension");
            System.exit(0);
        }

        String currDir = args[0];

        File dir = new File(currDir);
        String ext = "." + args[1];

        delete(dir, ext);
        System.out.println(deletedFiles + " files are deleted.");
    }

    public static void delete(File dir, String ext) {
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                delete(files[i], ext);
            } else {
                String fileName = files[i].getAbsolutePath();

                if (fileName.endsWith(ext)) {
                    System.out.print(fileName);
                    if (files[i].delete()) {
                        System.out.println("-- delete success.");
                        deletedFiles++;
                    } else {
                        System.out.println("-- delete failed.");
                    }
                }
            }
        }
    }
}
