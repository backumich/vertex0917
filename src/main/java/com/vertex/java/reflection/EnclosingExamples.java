package com.vertex.java.reflection;

public class EnclosingExamples {

    public EnclosingExamples(String justForFun) {
        class Inner {
            public void umbrella(){
                System.out.println(this.getClass().getEnclosingConstructor());
                System.out.println(this.getClass().isSynthetic());
            }
        }

        Inner inner = new Inner();
        inner.umbrella();
    }

    @Override
    public String toString(){
        return "test";
    }

    public static void main(String[] args) {
        new EnclosingExamples("wetfbejnv;klmahvqpkowd");

    }
}
