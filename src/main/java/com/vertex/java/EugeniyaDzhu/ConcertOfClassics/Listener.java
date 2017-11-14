package com.vertex.java.EugeniyaDzhu.ConcertOfClassics;

public class Listener implements Comparable<Listener> {

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
        };

        int comparableField = numberOfBrooches;
        int oComparableField = o.getNumberOfBrooches();

        if (sex == Sex.GENTLEMAN) {
            comparableField = lengthOfMustache;
        };

        if (o.sex == Sex.GENTLEMAN) {
            oComparableField = o.getLengthOfMustache();
        };

        if (comparableField == oComparableField){
            toReturn = sex.compareTo(o.sex);
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
}
