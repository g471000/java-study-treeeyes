package ch14.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamEx6 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("Lee Pikachu", 3, 300),
                new Student("Kim Pikachu", 1, 200),
                new Student("Ahn Pikachu", 2, 100),
                new Student("Park Pikachu", 2, 150),
                new Student("So Pikachu", 1, 200),
                new Student("Na Pikachu", 3, 290),
                new Student("Chon Pikachu", 3, 180)
        };

        List<String> names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
        System.out.println(names);

        Student[] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);

        for (Student s : stuArr2) {
            System.out.println(s);
        }

        Map<String, Student> studentMap = Stream.of(stuArr).collect(Collectors.toMap(s -> s.getName(), p -> p));

        for (String name : studentMap.keySet()) {
            System.out.println(name + " - " + studentMap.get(name));
        }

        long count = Stream.of(stuArr).collect(counting());
        long totalScore = Stream.of(stuArr).collect(summingInt(Student::getTotalScore));

        System.out.println("count = " + count);
        System.out.println("totalScore = " + totalScore);

        Optional<Student> topStudent = Stream.of(stuArr)
                .collect(maxBy(Comparator.comparingInt(Student::getTotalScore)));
        System.out.println("topStudent: " + topStudent);

        IntSummaryStatistics stat = Stream.of(stuArr)
                .collect(summarizingInt(Student::getTotalScore));
        System.out.println(stat);

        String studentNames = Stream.of(stuArr).map(Student::getName)
                .collect(joining(",", "{", "}"));
        System.out.println(studentNames);
    }
}

class Student implements Comparable<Student> {

    String name;
    int numClass;
    int totalScore;

    Student(String name, int classNum, int totalScore) {
        this.name = name;
        this.numClass = classNum;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, numClass, totalScore);
    }

    String getName() {
        return name;
    }

    int getNumClass() {
        return numClass;
    }

    int getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
