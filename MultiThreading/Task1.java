class Patient extends Thread {
    private String name;
    private int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public void run() {
        System.out.println("Patient " + name + " with priority " + priority + " is undergoing tests.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Patient " + name + " has completed tests.");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Patient patient1 = new Patient("John", 1);
        Patient patient2 = new Patient("Mary", 2);
        Patient patient3 = new Patient("Peter", 3);

        patient1.setPriority(Thread.MAX_PRIORITY);
        patient2.setPriority(Thread.NORM_PRIORITY);
        patient3.setPriority(Thread.MIN_PRIORITY);

        patient1.start();
        patient2.start();
        patient3.start();

        try {
            patient1.join();    //this method waits for the thread to die
            patient2.join();
            patient3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

/*
1. Resource Allocation in a Hospital:
You are developing a scheduling system for a hospital. Each patient is represented as a thread, and they need to be scheduled for medical tests. Assign different priority levels to patients based on the severity of their condition. Implement the scheduling system to ensure that high-priority patients are tested first while lower-priority patients wait their turn.
*/