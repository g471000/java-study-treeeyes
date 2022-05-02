package ch12.Annotation;

class Parent {
    void parentMethod(){
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void parentMethod(){
        System.out.println("Child");
    }
}

class AnnotationEx1 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.parentMethod();

        Child c = new Child();
        c.parentMethod();

        Parent pc = new Child();
        pc.parentMethod();
    }
}