class Royal {
    public void managingDirector() {
        System.out.println("Managing Director");
    }
}

class Employee extends Royal {
    public void director() {
        System.out.println("Director");
    }

    public String[] employee() {
        return new String[] {"Krutarth Sir", "Zafar Sir", "Shrey Sir", "Jaynam Sir"};
    }
}

class Clerk extends Royal {
    public void clerk() {
        System.out.println("Clerk");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println();

        e.managingDirector();
        e.director();

        System.out.print("Employees: ");
        for (String empName : e.employee()) {
            System.out.print(empName + ", ");
        }
        System.out.println();

        Clerk c = new Clerk();
        System.out.println();

        c.managingDirector();
        c.clerk();
    }
}

/*
 * 
 * To compile and run this program:
 * 
 * $ javac Hierarchical.java
 * 
 * $ java Hierarchical
 */