package ch13.stream;

import java.util.*;
import java.util.stream.*;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student01> studentStream = Stream.of(
                new Student01("Lee Pikachu", 3, 300),
                new Student01("Kim Pikachu", 1, 200),
                new Student01("Ahn Pikachu", 2, 100),
                new Student01("Park Pikachu", 2, 150),
                new Student01("Chon Pikachu", 1, 200),
                new Student01("Na Pikachu", 3, 290),
                new Student01("Kim Pikachu", 3, 180));

        studentStream.sorted(Comparator.comparing(Student01::getClassNum).thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

    }
}

class Student01 implements Comparable<Student01> {
    String name;
    int classNum;
    int totalScore;

    Student01(String name, int classNum, int totalScore) {
        this.name = name;
        this.classNum = classNum;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, classNum, totalScore);
    }

    String getName() {
        return name;
    }

    int getClassNum() {
        return classNum;
    }

    int totalScore() {
        return totalScore;
    }

    public int compareTo(Student01 student) {
        return student.totalScore - this.totalScore;
    }
}
