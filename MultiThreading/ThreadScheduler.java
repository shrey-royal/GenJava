public class ThreadScheduler {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        Thread t3 = new Thread(new MyRunnable());

        // t1.setPriority(Thread.MIN_PRIORITY);    // 1 (Lowest Priority)
        // t2.setPriority(Thread.NORM_PRIORITY);    // 5 (Default)
        // t3.setPriority(Thread.MAX_PRIORITY);    // 10 (Highest Priority)

        t1.start();
        t2.start();
        t3.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for(int i=1; i<=5; i++) {
                System.out.println(Thread.currentThread().getName() + ": Count " + i);
                try {   //may throw interruptedException
                    Thread.sleep(1000); // 1000 milliseconds = 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}

/*
Scheduling the Thread: 

Priority: Priority lies between 1 to 10 for a thread where 1 is the lowest priority and 10 is the highest priority and 5 is the default priority.

Time of Arrival: A thread that arrived first will get the chance first to execute than the threads that arrived later. (in case of same priority)

Time Scheduler algorithms:

1. First Come First Serve (FCFS): The thread that arrives first will get the chance first to execute than the threads that arrived later.

2. Time-slicing Scheduling: Each thread is assigned a fixed time slot in a cyclic way.

3. Preemptive-priority Scheduling: A thread with higher priority is executed first and lower priority thread executes after the higher priority thread.


Tasks:

1. Resource Allocation in a Hospital:
You are developing a scheduling system for a hospital. Each patient is represented as a thread, and they need to be scheduled for medical tests. Assign different priority levels to patients based on the severity of their condition. Implement the scheduling system to ensure that high-priority patients are tested first while lower-priority patients wait their turn.

2. Traffic Signal Control:
Simulate a traffic intersection where each lane of traffic is represented by a thread. Implement a custom thread scheduling algorithm to control the traffic signals. Threads representing bus lanes may have higher priority than regular lanes, and the scheduler should handle traffic flow accordingly.

3. Online Auction System:
Create a multithreaded online auction system where bidders are represented as threads. Each bidder has a different priority level based on their bid amount or bidding history. Implement a scheduling mechanism to ensure that high-priority bidders have an advantage in placing their bids.

4. Flight Reservation System:
Develop a flight reservation system where passengers' booking requests are represented as threads. Passengers with special needs (e.g., disabilities) may have higher priority for seat allocation. Implement a thread synchronization mechanism to ensure that passengers are allocated seats in a fair and organized manner.

5. Multiplayer Online Game:
Design a multiplayer online game server where players' actions are represented as threads. Players with higher in-game achievements or premium subscriptions may have higher priority for processing their actions. Implement a custom thread scheduling algorithm to provide a fair and enjoyable gaming experience for all players

*/