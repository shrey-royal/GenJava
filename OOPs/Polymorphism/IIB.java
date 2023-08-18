class Student {
    int rollno;
    String name;
    String college;

    // instance initializer block
    {
        System.out.println("Instance Initializer Block");
        college = "LDRP";   // it will be initialized before constructor
    }

    // constructor
    Student(int rollno, String name) {
        System.out.println("Constructor called");
        this.rollno = rollno;
        this.name = name;
    }

    // method to display the values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class IIB {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");

        s1.display();
        s2.display();
    }
}

/*
Instance Initializer Block in java:
> It is used to initialize the instance data member.
> It run each time when object of the class is created.
> The initialization of the instance variable can be directly but there can be performed extra operations while initializing the instance variable in the instance initializer block.

class {
    instance variable;

    //static block

    //iib

    //constructor

    //methods
}

// static -> iib -> constructor -> methods

*/