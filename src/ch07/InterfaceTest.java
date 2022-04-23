package ch07;

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());

        a.autoPlay(new B());
        a.autoPlay(new C());

       a.methodA();
    }
}

class A {
    public void methodA(B b) {
        b.methodB();
    }

    public void methodA() {
        I i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }

    void autoPlay(I i) {
        i.play();
    }
}


class B implements I {
    public void methodB() {
        System.out.println("methodB in B class");
    }

    @Override
    public void play() {
        System.out.println("Play in B class");
    }

    public String toString() {
        return "class B";
    }
}

class C implements I {
    @Override
    public void play() {
        System.out.println("Play in C class");
    }

    @Override
    public void methodB() {
        System.out.println("methodB in class C");
    }
}

interface I {
    public abstract void play();

    public abstract void methodB();
}

class InstanceManager {
    public static I getInstance() {
        return new B();
    }
}