package com.vertex.java.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class FunctionsExperiments {

    private static List<String> words = Arrays.asList("test", "static", "method", "on", "class");

    public static void main(String[] args) {

//        optionalExample();
        countLettersInWords();
//        checkWhatWouldBeIfGiveNullToOptional();

//        experimentWithNewStreamFeatures();

    }

    private static void experimentWithNewStreamFeatures() {
        Stream<String> sortedStream = words.stream().sorted(String::compareTo);
        Stream<String> unsortedStream = words.stream();

//        sortedStream.takeWhile();
    }

    private static void countLettersInWords() {

        Map<Object, Long> collect =
        words.stream()
        .flatMapToInt(String::chars)
                .mapToObj(charr -> String.valueOf((char) charr))
//        .forEach(System.out::println);
                .collect(groupingBy(o -> o, counting()));

        System.out.println(collect);
    }

    private static void optionalExample() {
        Optional<String> any = words.stream()
                .peek(System.out::println)
                .skip(10)
                .findAny();
//                .limit(10)
//                .forEach(System.out::println);

//        System.out.println(collect);


        System.out.println(any.orElse(""));
    }

    private static void checkWhatWouldBeIfGiveNullToOptional() {

        Object test = null;
        Optional<Object> optioanlTest = Optional.ofNullable(test);

        System.out.println(optioanlTest.orElse("optional is ok"));
    }

}
