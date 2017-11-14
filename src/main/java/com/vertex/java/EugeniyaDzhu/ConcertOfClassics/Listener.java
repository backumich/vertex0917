package com.vertex.java.EugeniyaDzhu.ConcertOfClassics;

import java.util.Comparator;

public class Listener implements Comparable<Listener> , Comparator<Listener>{

    private int numberOfBrooches;
    private int lengthOfMustache;
    private Sex sex;

    @Override
    public String toString() {
        return "Listener{" +
                "sex=" + sex +
                (sex == Sex.LADY ? ", numberOfBrooches=" + numberOfBrooches : ", lengthOfMustache=" + lengthOfMustache)
                +
                "}";
    }

    public Listener() {
        this.sex = Sex.LADY;
    }

    public Listener(Sex sex) {
        this.sex = sex;
    }

    public Listener(Sex sex, int broochesOrMustache) {
        if (!(sex == null)) {this.sex = sex;}
        if (this.sex == Sex.LADY){
            this.numberOfBrooches = broochesOrMustache;
        } else {
            this.lengthOfMustache = broochesOrMustache;
        };
    }

    @Override
    public int compareTo(Listener o) {

        int toReturn = 0;

        if (o == null) {
            toReturn = 1;
            System.out.println("Null");
            return toReturn;
        };

        int comparableField = numberOfBrooches;
        int oComparableField = o.getNumberOfBrooches();

        if (sex == Sex.GENTLEMAN) {
            comparableField = lengthOfMustache;
        };

        if (o.getSex() == Sex.GENTLEMAN) {
            oComparableField = o.getLengthOfMustache();
        };

        if (comparableField == oComparableField){
            toReturn = sex.compareTo(o.getSex());
        }
        else{
            toReturn = comparableField > oComparableField ? -1 : 1;
        };

        return toReturn;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getLengthOfMustache() {

        return lengthOfMustache;
    }

    public void setLengthOfMustache(int lengthOfMustache) {
        this.lengthOfMustache = lengthOfMustache;
    }

    public int getNumberOfBrooches() {

        return numberOfBrooches;
    }

    public void setNumberOfBrooches(int numberOfBrooches) {
        this.numberOfBrooches = numberOfBrooches;
    }

    public Ticket getNewTicket(){
        Ticket ticket = new Ticket();
        return ticket;
    }

    @Override
    public int compare(Listener o1, Listener o2) {

        int toReturn = 0;

        if (o1 == null) {
            System.out.println("Null");
            if (o2 == null) {
                System.out.println("Null");
                return 0;
            };
            return -1;
        };
        if (o2 == null) {
            System.out.println("Null");
            return 0;
        };

        int firstComparableField  = o1.getNumberOfBrooches();
        int secondComparableField = o2.getNumberOfBrooches();

        if (o1.getSex() == Sex.GENTLEMAN) {
            firstComparableField = o1.getLengthOfMustache();
        };

        if (o2.getSex() == Sex.GENTLEMAN) {
            secondComparableField = o1.getLengthOfMustache();
        };

        if (firstComparableField == secondComparableField){
            toReturn = o1.getSex().compareTo(o2.getSex());
        }
        else{
            toReturn = firstComparableField > secondComparableField ? -1 : 1;
        };

        return toReturn;

    }
}
