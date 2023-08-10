class School {
    String schoolName;
    String schoolAddress;

    School(String name, String address) {
        this.schoolName = name;
        this.schoolAddress = address;
    }
}

class Student {
    School objSchool;  // Aggregation
    String name;
    int rollNo;
    Student(String name, int rollNo, String schoolName, String schoolAddress) {
        this.name = name;
        this.rollNo = rollNo;
        this.objSchool = new School(schoolName, schoolAddress);
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("School Name: " + this.objSchool.schoolName);
        System.out.println("School Address: " + this.objSchool.schoolAddress);
    }
}


public class Aggregation {
    public static void main(String[] args) {
        Student s = new Student("Krutarth", 1, "Sarvajanik", "Surat");
        s.display();
    }
}

/*
Aggregation is a type of inheritance where we have to pass the whole object of the parent class to the child class.
*/