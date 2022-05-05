package ch06.Exercise;

/**
 * A and B are creating excaption.
 * static variable (on the line A) cannot be assigned with iv because it is a instance variable. The class variable created first when the program runs, and the instance variable is created when the program created the instance. So, automatically staticMethod2 is generating the error too, because of line A and b.
 */
class MemberCall {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;
//    static int cv2 = iv; // A 라인

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv); // B 라인
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); // C 라인
    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1(); // D 라인
    }

    void instanceMethod2() {
        staticMethod1(); // E 라인
        instanceMethod1();
    }
}
