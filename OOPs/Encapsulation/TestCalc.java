import calculator.Calc;

public class TestCalc {
    public static void main(String[] args) {
        Calc c = new Calc();

        c.add(10, 20);
        c.sub(20, 10);
        c.mul(10, 20);
        c.div(20, 10);
        c.mod(20, 10);
        c.power(10, 2);
    }
}
