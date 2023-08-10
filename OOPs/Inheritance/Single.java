class Royal {
    public void managingDirector() {
        System.out.println("Managing Director: Dhiraj Poojara");
    }

    public void director() {
        System.out.println("Director: DL Sir");
    }
}

class Employee extends Royal {
    public String[] employee() {
        return new String[] {"Krutarth Sir", "Zafar Sir", "Shrey Sir", "Jaynam Sir"};
    }
}

public class Single {
    // Single Inheritance
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
    }
}