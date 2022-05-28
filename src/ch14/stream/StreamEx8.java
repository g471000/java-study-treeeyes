package ch14.stream;

import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class StreamEx8 {
    public static void main(String[] args) {
        CSStudent[] stuArr = {
                new CSStudent("Pika1", false, 1, 1, 300),
                new CSStudent("Pika2", true, 1, 1, 250),
                new CSStudent("Pika3", true, 1, 1, 200),
                new CSStudent("Pika4", false, 1, 2, 150),
                new CSStudent("Pika5", true, 1, 2, 100),
                new CSStudent("Pika6", false, 1, 2, 50),
                new CSStudent("Pika7", false, 1, 3, 100),
                new CSStudent("Pika8", false, 1, 3, 150),
                new CSStudent("Pika9", false, 1, 3, 200),

                new CSStudent("Pika11", true, 2, 1, 300),
                new CSStudent("Pika12", true, 2, 1, 250),
                new CSStudent("Pika13", true, 2, 1, 200),
                new CSStudent("Pika14", true, 2, 2, 150),
                new CSStudent("Pika15", false, 2, 2, 100),
                new CSStudent("Pika16", false, 2, 2, 50),
                new CSStudent("Pika17", true, 2, 3, 100),
                new CSStudent("Pika18", true, 2, 3, 150),
                new CSStudent("Pika19", false, 2, 3, 200),
        };
        System.out.println("1. Group by classNumber");
        Map<Integer, List<CSStudent>> studentByClassNumber = Stream.of(stuArr)
                .collect(groupingBy(CSStudent::getClassNumber));

        for (List<CSStudent> students : studentByClassNumber.values()) {
            for (CSStudent s : students) {
                System.out.println(s);
            }
        }
        System.out.println();

        System.out.println("2. Group by scores");
        Map<CSStudent.Level, List<CSStudent>> studentByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 200) return CSStudent.Level.HIGH;
                    else if (s.getScore() >= 100) return CSStudent.Level.MID;
                    else return CSStudent.Level.LOW;
                }));

        TreeSet<CSStudent.Level> keySet = new TreeSet<>(studentByLevel.keySet());
        for (CSStudent.Level key : keySet) {
            System.out.printf("[%s]\n", key);
            for (CSStudent s : studentByLevel.get(key)) {
                System.out.println(s);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("3. Number of students per each level");
        Map<CSStudent.Level, Long> studentCountByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 200) return CSStudent.Level.HIGH;
                    else if (s.getScore() >= 100) return CSStudent.Level.MID;
                    else return CSStudent.Level.LOW;
                }, counting()));

        for (CSStudent.Level key : studentCountByLevel.keySet()) {
            System.out.printf("[%s] - %d students\n", key, studentCountByLevel.get(key));
        }
        System.out.println();

        System.out.println("4. Group by each year and class number.");
        Map<Integer, Map<Integer, List<CSStudent>>> studentByYearAndClass =
                Stream.of(stuArr)
                        .collect(groupingBy(CSStudent::getYear, groupingBy(CSStudent::getClassNumber)));

        for (Map<Integer, List<CSStudent>> studentsInYear : studentByYearAndClass.values()) {
            for (List<CSStudent> studentsInClassNum : studentsInYear.values()) {
                System.out.println();
                for (CSStudent s : studentsInClassNum) {
                    System.out.println(s);
                }
            }
        }
        System.out.println();

        System.out.println("5. Group by year, and each class top student");
        Map<Integer, Map<Integer, CSStudent>> topStudentByYearAndClass = Stream.of(stuArr)
                .collect(groupingBy(CSStudent::getYear,
                        groupingBy(CSStudent::getClassNumber,
                                collectingAndThen(
                                        maxBy(Comparator.comparingInt(CSStudent::getScore))
                                        , Optional::get
                                ))));

        for (Map<Integer, CSStudent> classNum : topStudentByYearAndClass.values()) {
            for (CSStudent s : classNum.values()) {
                System.out.println(s);
            }
        }
        System.out.println();

        System.out.println("6. stat which group by year and each class's score group.");
        Map<String, Set<CSStudent.Level>> studentByScoreGroup =
                Stream.of(stuArr)
                        .collect(groupingBy(s -> s.getYear() + "-" + s.getClassNumber(),
                                mapping(s -> {
                                    if (s.getScore() >= 200) return CSStudent.Level.HIGH;
                                    else if (s.getScore() >= 100) return CSStudent.Level.MID;
                                    else return CSStudent.Level.LOW;
                                }, toSet())));

        Set<String> keySet2 = studentByScoreGroup.keySet();

        for (String key : keySet2) {
            System.out.printf("[%s]: %s\n", key, studentByScoreGroup.get(key));
        }
    }
}
