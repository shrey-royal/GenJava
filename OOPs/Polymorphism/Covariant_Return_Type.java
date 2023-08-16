class Shape {
    public Shape draw() {
        //Draw the shape
        return this;
    }

    // void a(int a) {
    //     System.out.println("a");
    // }
}

class Circle extends Shape {
    @Override
    public Circle draw() {
        //Draw the circle
        System.out.println("Drawing Circle");
        return this;    //returning an object of class Circle
    }

    // @Override
    // int a(int a) {
    //     System.out.println("b");
    //     return 0;
    // }
}

class Rectangle extends Shape {
    @Override
    public Rectangle draw() {
        //Draw the rectangle
        System.out.println("Drawing Rectangle");
        return this;
    }
}


public class Covariant_Return_Type {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle.draw());
        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}
/*

Covariant Return Type in Java: 
> Covariant return type specifies that the return type may vary in the same direction as the subclass.

> In simple terms, a subclass can override the method of the superclass with a return type that is a subclass of the return type declared in the superclass.

for example: 

class A {
    // a method which returns a class A object
    A get() {
        return this;    //returning an object of class A
    }
}

class B extends A {
    // overriding the get method
    // it returns a class B object
    @Override
    B get() {
        return this;    //returning an object of class B
    }
}

Tasks:


1. Problem Statement: Online Retail Store

Scenario: You are designing a class hierarchy for an online retail store. You have a base class `Product`, and subclasses `Electronics`, `Clothing`, and `Books`. Each subclass has a method `getDetails()` that returns an instance of the corresponding subclass.

2. Problem Statement: Banking System

Scenario: You are developing a banking system with a base class `Account` and subclasses `SavingsAccount` and `CheckingAccount`. Each account type has a method `getStatement()` that returns an instance of the corresponding account type.

3. Problem Statement: Geographical Mapping

Scenario: You are building a geographical mapping application. You have a base class `Location` and subclasses `City`, `Landmark`, and `Waterbody`. Each subclass has a method `getInfo()` that returns an instance of the corresponding subclass.

4. Problem Statement: Educational Institution

Scenario: You are creating a system for an educational institution. You have a base class `Person` with subclasses `Student`, `Teacher`, and `Staff`. Each subclass has a method `getProfile()` that returns an instance of the corresponding subclass.

5. Problem Statement: Vehicle Fleet Management

Scenario: You are developing software for managing a vehicle fleet. You have a base class `Vehicle` with subclasses `Car`, `Truck`, and `Motorcycle`. Each vehicle type has a method `generateReport()` that returns an instance of the corresponding vehicle type.

These problem statements and scenarios showcase the practical applications of covariant return types in Java. By utilizing covariant return types, you can design more intuitive and elegant class hierarchies that make use of polymorphism in real-world contexts.


*/