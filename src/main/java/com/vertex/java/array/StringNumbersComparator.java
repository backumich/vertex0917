package com.vertex.java.array;

import java.util.Arrays;
import java.util.Comparator;

public class StringNumbersComparator implements Comparator<String> {

    @Override
    public int compare(String firstNumber, String secondNumber) {
//        return thenComparingInt(this::toInt) //produces StackOverflowError !!!!
//                .compare(firstNumber, secondNumber);
        int firstInt=toInt(firstNumber);
        int secondInt = toInt(secondNumber);
        return firstInt > secondInt ? 1 : firstInt == secondInt ? 0 : -1;
    }

    private int toInt(String number) {
        int toReturn;
        switch (number.toUpperCase()) {
            case "ZERO":
                toReturn = 0;
                break;
            case "ONE":
                toReturn = 1;
                break;
            case "TWO":
                toReturn = 2;
                break;
            case "THREE":
                toReturn = 3;
                break;
            case "FOUR":
                toReturn = 4;
                break;
            case "FIVE":
                toReturn = 5;
                break;
            case "SIX":
                toReturn = 6;
                break;
            case "SEVEN":
                toReturn = 7;
                break;
            case "EIGHT":
                toReturn = 8;
                break;
            case "NINE":
                toReturn = 9;
                break;
            default: throw new IllegalArgumentException("no such number");

        }

        return toReturn;
    }

    public static void main(String[] args) {
        String[] toSort = new String[] {"five", "one", "seven"};
        Arrays.sort(toSort, new StringNumbersComparator());

        System.out.println(Arrays.toString(toSort));
    }
}
