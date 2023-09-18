class MyThread extends Thread {
    public void run() { // run() method is used to perform action for a thread.
        System.out.println("Thread is running...");
    }
}

class MyThread2 implements Runnable {   
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class CreateThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // start() method is used to start a newly created thread.
        
        MyThread2 t2 = new MyThread2(); // Runnable interface is used to create a thread.
        Thread t = new Thread(t2, "newName");  // Thread class is used to create a thread.
        t.start();
        System.out.println("Name of thread: " + t.getName());

        Thread newThread = new Thread("My Thread 1");
        newThread.start();  //active state
        System.out.println("Name of thread: " + newThread.getName());
    
    }
}
/*
MultiThreading is a process of executing multiple threads simultaneously.
Thread is a lightweight sub-process, smallest unit of processing.
Multiple threads can make a process faster because threads are independent, so it doesn't wait for another thread and we can perform multiple operations at the same time.

> When a class is thread safe it means that multiple threads can use it at the same time, and it will behave correctly and not break.

> When a class is not thread safe it means that multiple threads can't use it at the same time, and it may behave incorrectly and break.

Advantages of MultiThreading:

1. It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
2. You can perform many operations together, so it saves time.
3. Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.

Life cycle of Thread (Thread States):
1. New: The thread is in new state if you create an instance of Thread class but before the invocation of start() method.
2. Active: The thread is in active state if the thread has been started and has not yet been terminated.
3. Blocked/Waiting: This state occurs when a thread is waiting for some resource.
4. Timed Waiting: A thread is in timed waiting state when it calls a method with a time out parameter.
5. Terminated: A thread is in terminated or dead state when its run() method exits.

Task: Create a thread and add 4 float numbers and print the output.
*/