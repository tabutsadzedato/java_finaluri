package ge.edu.btu;

public class Passenger {
    private boolean ticket;
    private String name;

    public Passenger(String name, boolean ticket) {
        this.ticket = ticket;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean haveTicket() {
        return this.ticket;
    }
}