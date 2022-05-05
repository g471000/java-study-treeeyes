package ch06.Exercise;

public class quiz19 {

    public static void change(String str) {
        // this str is used as local variable.
        str += "456";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:" + str);
    }
}

//ABC123
//After change:ABC123