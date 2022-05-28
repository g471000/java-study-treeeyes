package ch14.stream;

import java.util.*;
import java.util.stream.*;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class StreamEx7 {
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

        System.out.println("1. Partition by gender");
        Map<Boolean, List<CSStudent>> stuByGender = Stream.of(stuArr)
                .collect(partitioningBy(CSStudent::isMale));

        List<CSStudent> maleStudents = stuByGender.get(true);
        List<CSStudent> femaleStudents = stuByGender.get(false);

        System.out.println("male students:");
        for (CSStudent s : maleStudents) {
            System.out.println(s);
        }

        System.out.println("female students:");
        for (CSStudent s : femaleStudents) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("2. partition and stat (counting number of each gender).");

        Map<Boolean, Long> stuByGenderCount = Stream.of(stuArr)
                .collect(partitioningBy(CSStudent::isMale, counting()));

        System.out.println("Number of Male Students: " + stuByGenderCount.get(true));
        System.out.println("Number of Female Students: " + stuByGenderCount.get(false));
        System.out.println();

        System.out.println("3. Partition and stat (Highest score student for each gender)");
        Map<Boolean, Optional<CSStudent>> topScoreByGender = Stream.of(stuArr)
                .collect(partitioningBy(CSStudent::isMale, maxBy(comparingInt(CSStudent::getScore))));

        System.out.println("Male Top: " + topScoreByGender.get(true));
        System.out.println("Female Top: " + topScoreByGender.get(false));

        Map<Boolean, CSStudent> topScoreByGender2 = Stream.of(stuArr)
                .collect(partitioningBy(CSStudent::isMale,
                        collectingAndThen(
                                maxBy(comparingInt(CSStudent::getScore)), Optional::get
                        )));

        System.out.println("Male Top: " + topScoreByGender2.get(true));
        System.out.println("Female Top: " + topScoreByGender2.get(false));
        System.out.println();

        System.out.println("4. Partition(Failed Students, under 100)");

        Map<Boolean, Map<Boolean, List<CSStudent>>> failedStuByGender =
                Stream.of(stuArr).collect(partitioningBy(CSStudent::isMale,
                        partitioningBy(s -> s.getScore() <= 100)));

        List<CSStudent> failedMaleStudents = failedStuByGender.get(true).get(true);
        List<CSStudent> failedFemaleStudents = failedStuByGender.get(false).get(true);

        System.out.println("Failed Male Students:");
        for (CSStudent s : failedMaleStudents) {
            System.out.println(s);
        }

        System.out.println("Failed Female Students:");
        for (CSStudent s : failedFemaleStudents) {
            System.out.println(s);
        }
    }
}

