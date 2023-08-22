class RBI {
    float getRateOfInterest() {
        return 6;   // Default rate of interest
    }
}

class SBI extends RBI {
    @Override
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends RBI {
    @Override
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends RBI {
    @Override
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class RuntimePolyumorphism {
    public static void main(String[] args) {
        RBI rbi = new RBI();
        System.out.println("Rate of interest of RBI: " + rbi.getRateOfInterest());

        rbi = new SBI();
        System.out.println("Rate of interest of SBI: " + rbi.getRateOfInterest());

        rbi = new ICICI();
        System.out.println("Rate of interest of ICICI: " + rbi.getRateOfInterest());

        rbi = new AXIS();
        System.out.println("Rate of interest of AXIS: " + rbi.getRateOfInterest());
    }
}
/*
Runtime polymorphism is also known as dynamic method dispatch. It is a process in which a function call to the overridden method is resolved at runtime rather than compile-time.

> Upcasting is casting a subtype to a supertype, up the inheritance tree. Downcasting is casting a supertype to a subtype, down the inheritance tree.

Real World Usecases of Runtime Polymorphism:

> Consider a scenario, Bank is a class that provides functionality to get the rate of interest. But, rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks could provide 8%, 7% and 9% rate of interest. If we create an instance of SBI, ICICI or AXIS, and call the getRateOfInterest() method, it will return the rate of interest based on the logic written in the method. So, the implementation of the getRateOfInterest() method is determined by the object that is being referred to by the reference variable.

*/