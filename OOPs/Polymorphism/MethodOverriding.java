class Devtao_P {
    void devtaDixit() {
        System.out.println("Devta: Dixit");
    }

    void devtaHarsh() {
        System.out.println("Devta: Harsh");
    }
}

class Devtao_C extends Devtao_P {

    @Override
    void devtaDixit() {
        super.devtaDixit();
        System.out.println("Devta: Dixit can fly");
    }

    @Override
    void devtaHarsh() {
        super.devtaHarsh();
        System.out.println("Devta: Harsh can run faster");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Devtao_C d = new Devtao_C();
        d.devtaDixit();
        d.devtaHarsh();
    }
}

/*
Method Overriding in java: 

When we have multiple methods with the same name and same parameters, then it is called method overriding.


*/