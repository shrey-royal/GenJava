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
