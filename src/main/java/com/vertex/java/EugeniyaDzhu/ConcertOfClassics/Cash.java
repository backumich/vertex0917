package com.vertex.java.EugeniyaDzhu.ConcertOfClassics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
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
        map = listenerList.stream().collect(Collectors.toMap(Listener::getNewTicket, l->l));
    }

    public static void printEntry(Ticket ticket, Listener listener){
        System.out.println(ticket.toString() + " " + listener.toString());
    }
}
