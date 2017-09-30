package com.vertex.java.homework1.patterns.factory;

import com.vertex.java.homework1.patterns.UserWithBuilder;

public class EnglishEmailWriter implements EmailWriter{

    public String writeEmail(UserWithBuilder userWithBuilder) {
        return "Dear sir, " + userWithBuilder.getName() + " Your code is not good enough. Please correct it.";
    }
}
