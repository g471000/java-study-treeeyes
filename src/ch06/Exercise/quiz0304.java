package ch06.Exercise;

public class quiz0304 {
    public static void main(String[] args) {
        Student s = new Student("Genie", 1, 1, 100, 60, 76);

        System.out.println(s.name);
        System.out.println(s.getTotal());
        System.out.println(s.getAverage());
    }
}
