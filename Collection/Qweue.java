import java.util.PriorityQueue;

public class Qweue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        q.clear();
        System.out.println(q);
        System.out.println(q.isEmpty());
    }
}

/*
Methods of Queue:
    1. add() - add element to the end of the Queue
    2. remove() - remove element from the front of the Queue
    3. peek() - return the element at the front of the Queue
    4. poll() - return the element at the front of the Queue and remove it
    5. size() - return the number of elements in the Queue
    6. isEmpty() - return true if the Queue is empty
    7. clear() - remove all elements from the Queue



*/