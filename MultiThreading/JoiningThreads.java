class JoinThreads extends Thread {
    @Override
    public void run() {
        for(int i=0; i<2; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            } catch (Exception ex) {
                System.out.println("Exception has been caught" + ex);
            }
            System.out.println("i: " + i);
        }
    }
}

public class JoiningThreads {
    public static void main(String[] args) {
        JoinThreads t1 = new JoinThreads();
        JoinThreads t2 = new JoinThreads();
        JoinThreads t3 = new JoinThreads();

        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.start();

        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t1.join();
        } catch (Exception ex) {
            System.out.println("Exception has been caught" + ex);
        }

        t2.start();

        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t2.join();
        } catch (Exception ex) {
            System.out.println("Exception has been caught" + ex);
        }

        t3.start();
    }
}

/*
Tasks: 
> Take input from an array of random numbers that includes -ve numbers and 0s as well. then use multithreading to find the sum of all the numbers in the array.
*/