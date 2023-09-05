interface Airport {
    void takeOff();
    void land();
}

interface Pilot {
    void fly();
}

class Airplane implements Airport, Pilot {
    @Override
    public void takeOff() {
        System.out.println("Airplane is taking off");
    }

    @Override
    public void land() {
        System.out.println("Airplane is landing");
    }

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.takeOff();
        airplane.fly();
        airplane.land();
    }
}