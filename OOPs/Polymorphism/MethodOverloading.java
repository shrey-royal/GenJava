class Devtao {
    void devtaDixit() {
        System.out.println("Devta: Dixit");
    }

    void devtaDixit(String superPower) {
        System.out.println("Devta: Dixit " + superPower);
    }

    void devtaHarsh() {
        System.out.println("Devta: Harsh");
    }

    void devtaHarsh(String superPower) {
        System.out.println("Devta: Harsh " + superPower);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Devtao d = new Devtao();
        d.devtaDixit();
        d.devtaHarsh();
        d.devtaDixit("can fly");
        d.devtaHarsh("can run fast");
    }
}

/*

Method Overloading in Java: When we have multiple methods with the same name but different parameters, then it is called method overloading.

class A {
    void display() {
        System.out.println("Hello");
    }

    void display(int a) {
        System.out.println("Hello " + a);
    }
}

*/