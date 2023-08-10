class Royal {
    public void managingDirector() {
        System.out.println("Managing Director: Dhiraj Poojara");
    }

    public void director() {
        System.out.println("Director: DL Sir");
    }
}

class Manager extends Royal {
    public String[] manager() {
        return new String[] {"Raj Sir", "Rajesh Sir", "Rajeev Sir"};
    }
}

class Employee extends Manager {
    public String[] employee() {
        return new String[] {"Krutarth Sir", "Zafar Sir", "Shrey Sir", "Jaynam Sir"};
    }
}


public class Multilevel {
    // Single Inheritance
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println();

        e.managingDirector();
        e.director();
        
        System.out.print("Managers: ");
        for (String manName : e.manager()) {
            System.out.print(manName + ", ");
        }
        System.out.println();
        
        System.out.print("Employees: ");
        for (String empName : e.employee()) {
            System.out.print(empName + ", ");
        }
        System.out.println();

    }
}