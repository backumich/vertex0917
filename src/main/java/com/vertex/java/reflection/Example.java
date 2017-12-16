package com.vertex.java.reflection;

import jdk.nashorn.api.scripting.URLReader;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

@Deprecated
public class Example {

    private static Set set;
    public String name;

    public Example(String stirng) {
        System.out.println(stirng);
    }

    public static void main(String[] args) {

        System.out.println("Starting main experiments with arguments: "
                + Arrays.toString(args));

//        System.out.println(String.class);
//        System.out.println(Arrays.toString(boolean.class.getConstructors()));
//        System.out.println(byte.class);
//        System.out.println(char.class);
//        System.out.println(short.class);
//        System.out.println(int.class);
//        System.out.println(long.class);
//        System.out.println(float.class);
//        System.out.println(double.class);

//
//        System.out.println(void.class.getName());
//        System.out.println(void.class.getCanonicalName());
//        System.out.println(void.class.getSimpleName());
//        System.out.println(void.class.getTypeName());
//        System.out.println(void.class.getSuperclass());
//        System.out.println(String.class.getSuperclass());
        System.out.println(void.class.isPrimitive());
//
//
//        System.out.println(ArrayList.class.getName());
//        System.out.println(ArrayList.class.getCanonicalName());
//        System.out.println(ArrayList.class.getSimpleName());
//        System.out.println(ArrayList.class.getTypeName());


//        System.out.println(Arrays.toString(Example.class.getDeclaredFields()));
//        System.out.println(Example.Experiment1.class.getDeclaringClass());
//        System.out.println(Example.class.getSimpleName() + ": Main experiments are finished");
//
//        Class<? extends EnclosingExamples> enclosingClass = (new EnclosingExamples("test"))
//                .getClass();
//        System.out.println(enclosingClass.getEnclosingConstructor());
//        System.out.println(Arrays.toString(enclosingClass.getSigners()));

//        String instance = "test";
//        System.out.println(Object.class.isInstance(instance));

//        System.out.println(Experiment1.class.isMemberClass());

    }

    public static class Experiment1 {

    }


}
