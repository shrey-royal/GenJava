class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
    void eat() {
        System.out.println("Parent is eating");
    }

    void property() {
        System.out.println("Parent's property");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's show()");
    }

    @Override
    void eat() {
        System.out.println("Harsh is eating");
    }

    @Override
    void property() {
        System.out.println("Child's property");
    }
}


public class Downcasting {
    public static void main(String[] args) {
        // Upcasting
        Parent parent = new Child();
        // Parent parent = new Parent();
        parent.show();
        parent.eat();

        // Downcasting
        Child child = (Child) parent;
        child.show();
    }
}


/*
Downcasting -> Static binding -> Compile polymorphism
Upcasting -> Dynamic binding -> Runtime polymorphism

We can only downcast the object which is previously upcasted.

Use cases of downcasting:
1. When we want to call the overridden method of the child class.
2. When we want to call the method of the child class which is present in the parent class but we want to change the functionality of the method.

Tasks:

Sure! Here are 10 problem statements related to downcasting in C++:

1. Write a program that demonstrates downcasting from a base class to a derived class.
2. Implement a function that performs downcasting safely, checking if the downcast is valid.
3. Create a class hierarchy and downcast an object to access specific derived class methods.
4. Develop a program that utilizes downcasting to access additional functionality in derived classes.
5. Design a system where downcasting is used to access specialized properties of derived classes.
6. Build a program that demonstrates the pitfalls of incorrect downcasting and potential runtime errors.
7. Implement a polymorphic function that utilizes downcasting to handle different derived class types.
8. Create a base class with virtual functions and downcast objects to invoke specific derived class behavior.
9. Develop a program that uses downcasting to access private members of derived classes.
10. Design a system where downcasting is used to implement dynamic behavior based on runtime type.

Remember, downcasting should be used with caution to avoid potential issues. Let me know if you need more information on any of these problem statements! 😊

*/