package com.vertex.java.patterns.factory;

import com.vertex.java.patterns.UserWithBuilder;

public class OgrEmailWriter implements EmailWriter{
    public String writeEmail(UserWithBuilder userWithBuilder) {
        return "Hey, Ogr!!! " + userWithBuilder.getName() + "!!! Your code sucks! Change it now!";
    }
}
