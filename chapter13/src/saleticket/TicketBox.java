package saleticket;

public class TicketBox {
    private int ticketNumber = 0; // 剩余票数

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public boolean hasTickets() {
        return ticketNumber > 0;
    }
}