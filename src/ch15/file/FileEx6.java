package ch15.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEx6 {
    static int found = 0;

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("USAGE: java FileEx6 DIRECTORY KEYWORD");
            System.exit(0);
        }

        File dir = new File(args[0]);
        String keyword = args[1];

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid Directory");
            System.exit(0);
        }

        try {
            findInFiles(dir, keyword);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.printf("Total found %s keywords in %d lines", keyword, found);
    }

    public static void findInFiles(File dir, String keyword) throws IOException {
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                findInFiles(files[i], keyword);
            } else {
                String fileName = files[i].getName();
                String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
                extension = "," + extension + ",";

                if (",java,txt,bac,".indexOf(extension) == -1) {
                    continue;
                }

                fileName = dir.getAbsolutePath() + File.separator + fileName;

                FileReader fr = new FileReader(files[i]);
                BufferedReader br = new BufferedReader(fr);

                String data = "";
                int lineNum = 0;

                while ((data = br.readLine()) != null) {
                    lineNum++;

                    if (data.indexOf(keyword) != -1) {
                        found++;
                        System.out.println("[" + fileName + "(" + lineNum + ")]" + data);
                    }
                }
                br.close();
            }
        }

    }
}
