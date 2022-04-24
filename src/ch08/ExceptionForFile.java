package ch08;

import java.io.*;

public class ExceptionForFile {
    public static void main(String[] args) throws IOException {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + " file was successfully created.");
        } catch (Exception e) {
            System.out.println(" Please try again. Error: " + e.getMessage());
        }
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("Invalid File Name.");
            }
        } catch (Exception e) {
            fileName = "Unknown.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File file) {
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Failed creating file.");
        }
    }
}
