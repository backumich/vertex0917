package com.vertex.java.collections;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionExperiments {

    public void removeFirstElementOfCollection(Collection<?> collection) {
        for (Object object : collection) {
            collection.remove(object);
        }
    }

    public static void main(String[] args) {
        CollectionExperiments experiments = new CollectionExperiments();
        List<String> test = new LinkedList<>();
        test.add("a");
        test.add("asdg");
        test.add("adas");
        test.add("ads");
        test.add("ah");
        test.add("b");
//        test.add("c");

//        System.out.println(test);

        String allStringsTogether = test.stream()
                .filter(s -> s.length() > 2)
                .collect(Collectors.joining(", "));

        System.out.println(allStringsTogether);

        test.forEach(System.out::print);
        System.out.println();

//        experiments.removeFirstElementOfCollection(test);
//        test.retainAll(Arrays.asList("a"));

        Collections.rotate(test, 2);

        System.out.println(test);

        int size = 10;
//        System.out.println(size >> 1);
        System.out.println(size >> 1 + size);

    }
}
