package com.vertex.java.EugeniyaDzhu.ConcertOfClassics;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Cash {
    
    private Map<Ticket, Listener> map;

    public Map<Ticket, Listener> getMap() {
        return map;
    }

    private Cash() {

    }

    public Cash(List<Listener> listenerList) {

        //Some listeners bought several tickets
        Iterator<Listener> iterator = listenerList.iterator();
        List<Listener> listenerListForFewTickets = new ArrayList<Listener>();
        while (iterator.hasNext()){

            Listener listener = iterator.next();
            listenerListForFewTickets.add(listener);
            if (Math.random() < 0.2) {listenerListForFewTickets.add(listener);}
            if (Math.random() < 0.2) {listenerListForFewTickets.add(listener);}
            if (Math.random() < 0.2) {listenerListForFewTickets.add(listener);}
        }

        map = listenerListForFewTickets.stream().collect(Collectors.toMap(Listener::getNewTicket, l->l));
    }

    public static void printEntry(Ticket ticket, Listener listener){
        System.out.println(ticket.toString() + " " + listener.toString());
    }
}
