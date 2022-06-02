package ch15.file;

import java.io.File;

public class FileEx2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("USAGE : java FIleEx2 DIRECTORY");
            System.exit(0);
        }

        File f = new File(args[0]);

        if (!f.exists() || !f.isDirectory()) {
            System.out.println("Invalid Directory.");
            System.exit(0);
        }

        File[] files = f.listFiles();

        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();
            System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
        }
    }
}
