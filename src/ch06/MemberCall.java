package ch06;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    static void staticMethod1() {
        System.out.println(cv);
        MemberCall mc = new MemberCall();
        System.out.println(mc.iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        // can use instance variable within the instance method
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
        //Have to create instance to call instance method
        MemberCall mc = new MemberCall();
        mc.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
