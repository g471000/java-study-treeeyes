package ch04;

public class FlowEx1 {
    public static void main(String[] args) {
        printTrueStatementsOnly(0);
        printTrueStatementsOnly(1);
    }

   static void printTrueStatementsOnly(int x) {
       System.out.printf("When x = %d, Below are true\n", x);

       if (x == 0) System.out.println("x == 0");
       if (x != 0) System.out.println("x != 0");
       if (!(x == 0)) System.out.println("!(x == 0)");
       if (!(x != 0)) System.out.println("!(x != 0)");
       System.out.println();
   }
}
