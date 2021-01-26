import ge.edu.btu.*;
public class StationSquareTest{

    public static void main(String[] args) {
        StationSquareTest tst = new StationSquareTest();

        System.out.print("Test 1 : ");
        if(tst.test1()) {
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        System.out.print("Test 2 : ");
        if(tst.test2()) {
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        System.out.print("Test 3 : ");
        if(tst.test3()) {
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        System.out.print("Test 4 : ");
        if(tst.test4()) {
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        System.out.print("Test 5 : ");
        if(tst.test5()) {
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

    }

    public boolean test1() {
        Train tr = new Train();
        tr.AddPassenger(new Passenger("gio", true));
        tr.AddPassenger(new Passenger("gio", true));
        tr.AddPassenger(new Passenger("gio", true));
        tr.AddPassenger(new Passenger("gio", true));
        return tr.getPassengerList().size() == 4;
    }

    public boolean test2() {
        Train tr = new Train();
        tr.AddPassenger(new Passenger("gio", false));
        tr.AddPassenger(new Passenger("gio", false));
        tr.AddPassenger(new Passenger("gio", false));
        tr.AddPassenger(new Passenger("gio", false));
        return tr.getPassengerList().size() == 0;
    }

    public boolean test3() {
        Train tr = new Train();
        tr.AddPassenger(new Passenger("gio", false));
        tr.AddPassenger(new Passenger("gio", true));
        tr.AddPassenger(new Passenger("gio", true));
        tr.AddPassenger(new Passenger("gio", true));
        tr.AddPassenger(new Passenger("gio", false));
        tr.AddPassenger(new Passenger("gio", false));
        tr.AddPassenger(new Passenger("gio", true));
        tr.AddPassenger(new Passenger("gio", true));
        return tr.getPassengerList().size() == 5;
    }

    public boolean test4() {
        Train tr = new Train();
        tr.AddPassenger(new Passenger("gio", false));
        tr.AddPassenger(new Passenger("gio", true));
        tr.AddPassenger(new Passenger("gio", true));
        tr.AddPassenger(new Passenger("gio", true));
        tr.AddPassenger(new Passenger("gio", false));
        tr.AddPassenger(new Passenger("gio", false));
        tr.AddPassenger(new Passenger("gio", true));
        tr.AddPassenger(new Passenger("gio", true));

        for(Passenger cur : tr.getPassengerList()) {
            if(!cur.haveTicket()) {
                return false;
            }
        }
        return true;
    }
    public boolean test5() {
        Passenger p = new Passenger("gio", false);
        return p.getName().equals("gio") && !p.haveTicket();
    }
}