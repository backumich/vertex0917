package com.vertex.java.EugeniyaDzhu.ConcertOfClassics;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Listener> listenerList = makeListenerList();
        listenerList = listenerList.stream()
                .sorted(Listener::compareTo)
                .collect(Collectors.toList());

        listenerList.stream()
                .forEachOrdered(System.out::println);

        Map<Ticket,Listener> cashMap = new Cash(listenerList).getMap();
        cashMap.forEach(Cash::printEntry);

        defineTheWinners(cashMap, listenerList);

        cashMap.entrySet().stream()
                .filter(l -> l.getKey().isWinner())
                .forEach((entry) -> {
                    System.out.println("Ticket #" + entry.getKey().getNumberOfTicket()
                                + (entry.getValue().getSex() == Sex.LADY ? ", number of brooches " + entry.getValue().getNumberOfBrooches(): ", length of mustache " +entry.getValue().getLengthOfMustache()));
                });

        HashSet<Listener> moreThenTwoTicketsListenerSet = FindBoughtMoreThenTwoTickets(cashMap.values().stream().collect(Collectors.toList()));
        moreThenTwoTicketsListenerSet.stream().forEachOrdered(System.out::println);

        HashSet<Cheater> cheaters = new HashSet<>();
        for (Listener listener : moreThenTwoTicketsListenerSet) {
            cheaters.add(new Cheater(listener));
            cheaters.add(new Cheater(listener));
        }

        cheaters.stream().forEachOrdered(System.out::println);


    }

    public static void defineTheWinners(Map<Ticket, Listener> map, List<Listener> listenerList) {
        int minNumberOfBrooches = listenerList.stream()
                .filter(l -> l.getSex() == Sex.LADY)
                .max(Listener::compareTo).get().getNumberOfBrooches();

        map.entrySet().stream()
                .filter(l -> l.getValue().getSex() == Sex.LADY)
                .filter(l -> l.getValue().getNumberOfBrooches() == minNumberOfBrooches)
                .forEach((entry) -> {
                    entry.getKey().setWinner(true);
                    //System.out.println("Ticket #" + entry.getKey().getNumberOfTicket() + ", number of brooches " + entry.getValue().getNumberOfBrooches());
                });

        int minLengthOfMustache = listenerList.stream()
                .filter(l -> l.getSex() == Sex.GENTLEMAN)
                .max(Listener::compareTo).get().getLengthOfMustache();

        map.entrySet().stream()
                .filter(l -> l.getValue().getSex() == Sex.GENTLEMAN)
                .filter(l -> l.getValue().getLengthOfMustache() == minLengthOfMustache)
                .forEach((entry) -> {
                    entry.getKey().setWinner(true);
                    //System.out.println("Ticket #" + entry.getKey().getNumberOfTicket() + ", length of mustache " + entry.getValue().getLengthOfMustache());
                });
    }

    public static List makeListenerList() throws IOException{

        FileReader fr = null;
        List<Listener> listenerList = new ArrayList();

        try {
            fr = new FileReader("src/main/java/com/vertex/java/EugeniyaDzhu/ConcertOfClassics/LadiesAndGentlemen.txt");
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {

                String string = scan.nextLine();
                String sex;
                if (string.indexOf("GENTLEMAN") > -1) {
                    sex = "GENTLEMAN";
                    string = string.substring(10);
                } else {
                    sex = "LADY";
                    string = string.substring(5);
                }

                Listener listener = new Listener(Sex.valueOf(sex), Integer.parseInt(string));
                listenerList.add(listener);

            }
        }catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        }
        catch (IOException ex) {
            System.out.println(ex.toString());
        }
        finally {
            if (fr != null) {
                try {
                    fr.close();
                }
                catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

        return listenerList;
    }

    public static HashSet FindBoughtMoreThenTwoTickets(List<Listener> listenerList) {

        HashSet<Listener> listenerSet = new HashSet<Listener>();
        HashSet<Listener> moreThenOneTicketListenerSet = new HashSet<Listener>();
        HashSet<Listener> moreThenTwoTicketsListenerSet = new HashSet<Listener>();

        Iterator<Listener> iterator = listenerList.iterator();
        while (iterator.hasNext()){
            Listener listener = iterator.next();
            if (moreThenOneTicketListenerSet.contains(listener)) {moreThenTwoTicketsListenerSet.add(listener);}
            if (listenerSet.contains(listener)) {moreThenOneTicketListenerSet.add(listener);}
            listenerSet.add(listener);
        }

        return moreThenTwoTicketsListenerSet;
    }
}
