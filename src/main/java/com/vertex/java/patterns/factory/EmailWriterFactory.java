package com.vertex.java.patterns.factory;

import com.vertex.java.patterns.UserWithBuilder;

public class EmailWriterFactory {
    public static EmailWriter getWriter(String nation) {
        EmailWriter toReturn;

        switch (nation) {
            case "English":
                toReturn = new EnglishEmailWriter();
                break;

            case "Ogr":
                toReturn = new OgrEmailWriter();
                break;

            default:
                throw new IllegalArgumentException("No such Nation");
        }

        return toReturn;
    }

    public static void main(String[] args) {
        UserWithBuilder ogrUser = new UserWithBuilder.Builder()
                .withName("Arght")
                .withAge(200)
                .withNation("Ogr")
                .build();

        UserWithBuilder englishUser = new UserWithBuilder.Builder()
                .withName("Dawe")
                .withAge(20)
                .withNation("English")
                .build();

        System.out.println(getWriter(ogrUser.getNation()).writeEmail(ogrUser));
        System.out.println(getWriter(englishUser.getNation()).writeEmail(englishUser));
    }

}
