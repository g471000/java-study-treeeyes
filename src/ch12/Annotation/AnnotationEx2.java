package ch12.Annotation;

import java.util.ArrayList;

class NewClass {
    int newField;

    int getNewField() {
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() {
        return oldField;
    }
}

public class AnnotationEx2 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldField = 10;
        nc.newField = 10;
        System.out.println(nc.getOldField());
        System.out.println(nc.getNewField());

        @SuppressWarnings("unchecked")
        ArrayList<NewClass> list = new ArrayList();
        list.add(nc);
    }
}
