package ch14.lambda;

@FunctionalInterface
interface MyFunction02 {
    void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction02 f = () -> {
        };

        Object obj = (MyFunction02) (() -> {
        });

        String str = ((Object) (MyFunction02) (() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunction02) (() -> {
        }));

        System.out.println(((Object)(MyFunction02)(() -> {})).toString());
    }
}
