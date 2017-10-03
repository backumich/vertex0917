package com.vertex.java.array;

import com.vertex.java.patterns.UserWithBuilder;

import java.util.Arrays;

public class ArraysExperiments {

    public static void main(String[] args) {
        UserWithBuilder[] users = new UserWithBuilder[]{
                new UserWithBuilder.Builder()
                        .withName("Vasia")
                        .withAge(123)
                        .withNation("Ogr")
                        .build(),
                new UserWithBuilder.Builder()
                .withName("Petia")
                .withNation("gorets")
                .withAge(99)
                .build()
        };

        System.out.println(users);
        System.out.println(Arrays.toString(users));
        System.out.println(Arrays.deepToString(users));
    }
}
