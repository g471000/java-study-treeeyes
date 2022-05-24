package ch14.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );

        Stream<String> strStream = strArrStream.flatMap(Arrays::stream);

        strStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not THere is no try",
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        Stream<String> stringStream1 = Stream.of("AAA", "ABC", "bBb", "Dd");
        Stream<String> stringStream2 = Stream.of("bbb", "aaa", "ccc", "dd");

        Stream<Stream<String>> strStreamStream = Stream.of(stringStream1, stringStream2);
        strStream = strStreamStream
                .map(s -> s.toArray(String[]::new))
                .flatMap(Arrays::stream);
        strStream.map(String::toLowerCase)
                .distinct()
                .forEach(System.out::println);
    }
}
