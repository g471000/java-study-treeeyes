package ch06.Exercise;

public class quiz20 {

    public static void main(String[] args)
    {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }

    public static int[] shuffle(int[] original) {
        if (original == null || original.length == 0) {
            return original;
        }
        for (int i = 0; i < original.length; i++) {
            int index = (int) (Math.random() * original.length);
            swap(original, i, index);
        }
        return original;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
