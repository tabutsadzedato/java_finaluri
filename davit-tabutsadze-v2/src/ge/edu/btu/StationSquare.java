package ge.edu.btu;


public class StationSquare {
    public static void main(String[] args) {
        Passenger gio = new Passenger("Gio", true);
        Passenger nika = new Passenger("Nika", false);
        Passenger ana = new Passenger("Ana", true);
        Passenger dato = new Passenger("dato", true);
        Passenger vaso = new Passenger("vaso", false);
        Passenger nino = new Passenger("nino", true);

        Train train = new Train();
        train.AddPassenger(gio);
        train.AddPassenger(nika);
        train.AddPassenger(ana);
        train.AddPassenger(dato);
        train.AddPassenger(vaso);
        train.AddPassenger(nino);

        for(Passenger cur : train.getPassengerList()) {
            System.out.println(cur.getName());
        }
    }
}
