package com.vertex.java.EugeniyaDzhu.ConcertOfClassics;

public class Cheater implements ListenerInterfase {

    private Listener listener;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cheater cheater = (Cheater) o;

        return listener != null ? listener.equals(cheater.listener) : cheater.listener == null;
    }

    public Listener getListener() {
        return listener;
    }

    @Override
    public int hashCode() {
        return listener != null ? listener.hashCode() * 32  + (int)(Math.random() * 10): 0;
    }

    public Sex getSex() {
        return listener.getSex();
    }

    @Override
    public String toString() {
        return "Cheater{" +
                listener.toString() +
                '}';
    }

    public int getLengthOfMustache() {

        return listener.getLengthOfMustache();
    }

    public int getNumberOfBrooches() {

        return listener.getNumberOfBrooches();
    }

    public Cheater(Listener listener) {
        this.listener = listener;
    }

}
