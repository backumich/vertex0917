package com.vertex.java.patterns.factory;

import com.vertex.java.patterns.UserWithBuilder;

public class EnglishEmailWriter implements EmailWriter{

    public String writeEmail(UserWithBuilder userWithBuilder) {
        return "Dear sir, " + userWithBuilder.getName() + " Your code is not good enough. Please correct it.";
    }
}
