public class DeadLock1 {
    public static void main(String[] args) {
        DeadLock1 test = new DeadLock1();

        final String resource1 = "Harsh Thakar";
        final String resource2 = "Ruby Harsh Thakar";

        //Thread-1
        Runnable b1 = new Runnable() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        //Thread-2
        Runnable b2 = new Runnable() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (resource2) {
                        System.out.println("Thread 2: locked resource 2");
                    }
                }
            }
        };

        new Thread(b1).start();
        new Thread(b2).start();

    }
}

/*
Tasks:

1. Multithreaded Bank Transactions:
   Create a Java program that simulates a bank with multiple customer accounts. Multiple threads represent customers trying to transfer money between accounts. Ensure that the program uses synchronization to prevent race conditions and potential deadlocks when multiple customers attempt transactions simultaneously.

2. Resource Allocation Deadlock:
   Design a Java program that simulates a resource allocation system with multiple resources and processes. Implement a scenario where processes request and release resources, potentially leading to a deadlock situation. Your program should detect and recover from deadlocks gracefully.

3. Producer-Consumer Problem:
   Implement the classic producer-consumer problem in Java using multiple producer and consumer threads. Ensure that the producers don't produce if the buffer is full, and consumers don't consume if the buffer is empty. Employ synchronization techniques to prevent race conditions and deadlocks.

4. Dining Philosophers Problem:
   Create a Java program that models the dining philosophers problem, where several philosophers sit at a circular dining table and attempt to pick up forks to eat. Ensure that philosophers can only eat if they have both forks, and implement a solution to prevent deadlock and resource contention using synchronization.

5. Reader-Writer Problem:
   Develop a Java program that simulates the reader-writer problem. Multiple readers can read a shared resource simultaneously, but only one writer can write to it at a time, and no reader should read while a writer is writing. Implement a solution that prevents writer starvation and ensures fairness using synchronization.

These problem statements cover various aspects of synchronization and deadlock scenarios in Java, and solving them will require careful consideration of thread synchronization techniques to avoid issues like race conditions and deadlocks.

*/