package ch05;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Pikachu", "Raichu", "Mewtwo"};

        for (int i = 0; i < names.length; i++) {
            System.out.printf("names[%d]: %s\n", i, names[i]);
        }

        String tmp = names[2];
        System.out.println("tmp: " + tmp);

        names[0] = "Pichu";

        for (String name : names) {
            System.out.println(name);
        }
    }
}
