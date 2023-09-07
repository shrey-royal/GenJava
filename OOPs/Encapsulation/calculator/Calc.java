package calculator;

public class Calc {
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Product: " + (a * b));
    }

    public void div(int a, int b) {
        System.out.println("Quotient: " + (a / b));
    }

    public void mod(int a, int b) {
        System.out.println("Remainder: " + (a % b));
    }

    public void power(int base, int power) {
        System.out.println("Power: " + (int) Math.pow(base, power));
    }
}