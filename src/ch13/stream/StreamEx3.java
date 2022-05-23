package ch13.stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Student02[] stuArr = {
                new Student02("Lee Pikachu", 3, 300),
                new Student02("Kim Pikachu", 1, 200),
                new Student02("Ahn Pikachu", 2, 100),
                new Student02("Park Pikachu", 2, 150),
                new Student02("Chon Pikachu", 1, 200),
                new Student02("Na Pikachu", 3, 290),
                new Student02("Kim Pikachu", 3, 180)
        };

        Stream<Student02> studentStream = Stream.of(stuArr);

        studentStream.sorted(Comparator.comparing(Student02::getClassNum).thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

        studentStream = Stream.of(stuArr);
        IntStream stuScoreStream = studentStream.mapToInt(Student02::getTotalScore);

        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
        System.out.println("count: " + stat.getCount());
        System.out.println("sum: " + stat.getSum());
        System.out.printf("average %.2f\n", stat.getAverage());
        System.out.println("min: " + stat.getMin());
        System.out.println("max: " + stat.getMax());
    }
}

class Student02 implements Comparable<Student02> {
    String name;
    int classNum;
    int totalScore;

    Student02(String name, int classNum, int totalScore) {
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

    int getTotalScore() {
        return totalScore;
    }

    public int compareTo(Student02 student) {
        return student.totalScore - this.totalScore;
    }
}
