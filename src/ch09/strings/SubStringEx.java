package ch09.strings;

public class SubStringEx {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        int index = fullName.indexOf('.');

        String fileName = fullName.substring(0, index);
        String ext = fullName.substring(index);

        System.out.println(fullName + "'s file name is: " + fileName);
        System.out.println(fullName + "'s ext is: " + ext);
    }
}
