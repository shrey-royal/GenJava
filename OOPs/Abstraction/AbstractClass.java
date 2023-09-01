abstract class ManubhaiNiBakery {
    abstract void makeCake();   // Abstract Method means no body (hidden from user)

    public void sellCake() {
        System.out.println("Selling Cake from ManubhaiNiBakery");
    }
}

class Manubhai extends ManubhaiNiBakery {
    @Override
    public void makeCake() {
        System.out.println("Making Cake");
    }

    // public void sellCake() {
    //     System.out.println("Manubhai Selling Cake");
    // }
}

public class AbstractClass {
    public static void main(String[] args) {
        Manubhai m = new Manubhai();
        m.makeCake();   // Abstract Method is implemented here
        m.sellCake();
    }
}

/*
Task:

1. Shape Hierarchy: Create an abstract class called 'Shape' with abstract methods like 'calculateArea()' and 'calculatePerimeter()'. Implement concrete subclasses like 'Circle', 'Rectangle', and 'Triangle' that inherit from 'Shape' and provide their own implementations for these methods.

2. Bank Account Management: Design an abstract class 'BankAccount' with abstract methods like 'deposit()', 'withdraw()', and 'getBalance()'. Create concrete subclasses like 'SavingsAccount' and 'CheckingAccount' that extend 'BankAccount' and implement these methods differently.

3. Vehicle Types: Build an abstract class 'Vehicle' with abstract methods 'start()', 'stop()', and 'accelerate()'. Derive concrete classes like 'Car', 'Motorcycle', and 'Truck' from 'Vehicle', each with their own unique implementations for these methods.

4. Employee Management: Create an abstract class 'Employee' with attributes like name, employee ID, and an abstract method 'calculateSalary()'. Subclasses like 'HourlyEmployee', 'SalariedEmployee', and 'ContractEmployee' should extend 'Employee' and provide their own salary calculation logic.

5. Geometric Shapes: Develop an abstract class 'GeometricShape' with abstract methods like 'draw()' and 'resize()'. Implement concrete subclasses like 'Circle', 'Rectangle', and 'Triangle' that extend 'GeometricShape' and provide specific drawing and resizing functionality.

*/