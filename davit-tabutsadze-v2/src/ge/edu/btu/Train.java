package ge.edu.btu;


import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Passenger> passengerList;

    public Train() {
        this.passengerList = new ArrayList<Passenger>();
    }

    public void AddPassenger(Passenger passenger) {
        if(passenger.haveTicket()) {
            passengerList.add(passenger);
        }
    }

    public ArrayList<Passenger> getPassengerList(){
        return (ArrayList<Passenger>) this.passengerList;
    }
}