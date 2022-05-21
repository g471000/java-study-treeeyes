package ch14;

@FunctionalInterface
interface MyFunction {
    void run();
}

public class LambdaEx1 {
    static void execute(MyFunction function) {
        function.run();
    }

    static MyFunction getMyFunction() {
        MyFunction function = () -> System.out.println("f3.run();");
        return function;
    }

    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1.run();");

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run();");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute( () -> System.out.println("run();"));
    }
}
