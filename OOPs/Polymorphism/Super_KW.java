class Parent {
    //Data Members / Instance Variables
    int a = 10;
    
    //Constructors
    Parent() {
        System.out.println("Parent Constructor");
    }

    //Methods
    void show(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    int a = 20;

    Child() {
        // 3. to invoke immediate parent class constructor.
        super();    // super() must be the first statement in the constructor.
        System.out.println("Child Constructor");
    }

    void show() {
        System.out.println("Child Class");
    }

    void callParent() {
        // 1. to refer immediate parent class instance variable.
        System.out.println("The value of a in Parent Class is " + super.a);

        // 2. to invoke immediate parent class method.
        System.out.println("Calling Parent Class Method");
        super.show();
    }
}

public class Super_KW {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("The value of a in Child Class is " + c.a);
        c.show();
        c.callParent();
    }
}

/*
Super Keyword is used to access the data members or methods of the parent class.

it is used in 3 cases:
1. to refer immediate parent class instance variable.
2. to invoke immediate parent class method.
3. to invoke immediate parent class constructor.

*/