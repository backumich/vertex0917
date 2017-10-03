package com.vertex.java.patterns.factory;

import com.vertex.java.patterns.UserWithBuilder;

public interface EmailWriter {

    String writeEmail(UserWithBuilder userWithBuilder);

}
