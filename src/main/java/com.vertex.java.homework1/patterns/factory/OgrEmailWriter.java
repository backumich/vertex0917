package com.vertex.java.homework1.patterns.factory;

import com.vertex.java.homework1.patterns.UserWithBuilder;

public class OgrEmailWriter implements EmailWriter{
    public String writeEmail(UserWithBuilder userWithBuilder) {
        return "Hey, Ogr!!! " + userWithBuilder.getName() + "!!! Your code sucks! Change it now!";
    }
}
