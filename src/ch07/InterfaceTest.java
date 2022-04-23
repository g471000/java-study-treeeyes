package ch07;

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());

        a.autoPlay(new B());
        a.autoPlay(new C());
    }
}

class A {
    public void methodA(B b) {
        b.methodB();
    }

    void autoPlay(I i) {
        i.play();
    }
}


class B implements I{
    public void methodB() {
        System.out.println("methodB");
    }

    @Override
    public void play() {
        System.out.println("Play in B class");
    }
}

class C implements I {
    @Override
    public void play() {
        System.out.println("Play in C class");
    }
}

interface I {
    public abstract void play();
}