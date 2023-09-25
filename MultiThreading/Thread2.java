public class Thread2 extends Thread {

    public void run() {
        System.out.println("running...");
    }

    public static void main(String[] args) {
        Thread2 t1 = new Thread2();

        //we cannot start a thread more than once
        // t1.start();
        // t1.start();

        //we can call run method directly
        // t1.run();

    }
}
