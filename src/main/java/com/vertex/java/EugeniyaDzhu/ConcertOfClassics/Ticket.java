package com.vertex.java.EugeniyaDzhu.ConcertOfClassics;

public class Ticket {

    private static final int MAX_SEATS = 10;
    private static final int MAX_ROWS  = 50;

    static int occupiedSeats = 1;
    static int occupiedRows = 1;
    static int occupiedNumberOfTicket = 1;
    private int seat;
    private int row;
    private int numberOfTicket;

    private boolean winner;

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public boolean isWinner() {
        return winner;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (seat != ticket.seat) return false;
        if (row != ticket.row) return false;

        return numberOfTicket == ticket.numberOfTicket;
    }

    @Override
    public int hashCode() {
        int result = seat;
        result = 31 * result + row;
        result = 31 * result + numberOfTicket;
        return result;
    }

    public Ticket(){

        seat = occupiedSeats;
        row = occupiedRows;
        numberOfTicket = occupiedNumberOfTicket;

        if (occupiedSeats == MAX_SEATS) {
            occupiedRows += 1;
            occupiedSeats = 1;
        } else {
            occupiedSeats += 1;
        }

        occupiedNumberOfTicket +=1;

        if (occupiedRows > MAX_ROWS) {
            System.out.println("Places are over, come again next time!");
        }

   }

    @Override
    public String toString() {
        return "Ticket" + numberOfTicket + "("
                + "R" + row
                + " , S" + seat + ")";
    }
}
