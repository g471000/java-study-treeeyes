package ch09.exercise;

public class Ex4 {
    public static void main(String[] args) {
        printGraph(new int[]{3, 7, 1, 4}, '*');
    }

    static void printGraph(int[] arr, char ch) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print('*');
            }
            System.out.println(arr[i]);
        }
    }
}
