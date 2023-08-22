// final keyword with a variable
/*
class A {
    final public int var = 10;

    void show() {
        //var = 20; // error: cannot assign a value to final variable var
        System.out.println("Value of var: " + var);
    }
}
*/
/*
// final keyword with a method
class B {
    final public void show() {
        System.out.println("In show method of class B");
    }
}

class C extends B {
    @Override
    public void show() {
        System.out.println("In show method of class C");
    }
}
*/
/*
final class D {
    void show() {
        System.out.println("In show method of class D");
    }
}

class E extends D {
    E() {
        System.out.println("In constructor of class E");
    }
}
*/


public class Final_KW {
    public static void main(String[] args) {
        /*
        A a = new A();
        a.show();
        // a.var = 23;  // error: cannot assign a value to final variable var
        // a.show();
        */
        /*
        B b = new B();
        b.show();
        */
        /*
        // D d = new D();
        // d.show();

        E e = new E();
        e.show();
        */
    }
}

/*
Final Keyword:

> It is used to define constants in java.
> It is used to prevent inheritance.
> It is used to prevent method overriding.
> It is used to prevent data member overriding.


We can use final keyword with:
1. Variable
2. Method
3. Class

*/