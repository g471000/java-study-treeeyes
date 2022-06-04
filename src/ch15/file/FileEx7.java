package ch15.file;

import java.io.File;
import java.io.FilenameFilter;

public class FileEx7 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("USAGE: java FileEx7 DIRECTORY pattern");
            System.exit(0);
        }

        String currDir = args[0];
        System.out.println(currDir);

        File dir = new File(currDir);
        final String pattern = args[1];

        String[] files = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.indexOf(pattern) != -1;
            }
        });

        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
