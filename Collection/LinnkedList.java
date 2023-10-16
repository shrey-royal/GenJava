import java.util.Deque;
import java.util.LinkedList;

public class LinnkedList {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();

        for (int i = 0; i < 20; i++)
            nums.addFirst((int)(Math.random() * 10));

        System.out.println(nums);

        System.out.println(nums.getFirst());
        System.out.println(nums.getLast());

        nums.removeFirst();
        nums.removeLast();

        System.out.println(nums.removeFirstOccurrence(4));
        System.out.println(nums.removeLastOccurrence(4));

        Deque<Integer> numbers = new LinkedList<>();

        numbers.offer(12);
        numbers.offerFirst(34);
        numbers.offerLast(56);

        System.out.println(numbers);

        // System.out.println(numbers.poll());
        // System.out.println(numbers.pollFirst());
        // System.out.println(numbers.pollLast());

        System.out.println(numbers.peek());
        System.out.println(numbers.peekFirst());
        System.out.println(numbers.peekLast());

        System.out.println(numbers.size());

        
    }
}

/*
Methods of LinkedList:

1. addFirst() - adds an element to the beginning of the list
2. addLast() - adds an element to the end of the list
3. removeFirst() - removes an element from the beginning of the list
4. removeLast() - removes an element from the end of the list
5. getFirst() - returns the first element of the list
6. getLast() - returns the last element of the list
7. removeFirstOccurrence() - removes the first occurrence of the specified element from the list
8. removeLastOccurrence() - removes the last occurrence of the specified element from the list

Other methods are same as ArrayList

Methods of Queue:

1. add() - adds an element to the queue
2. remove() - removes an element from the queue
3. element() - returns the element at the head of the queue
4. offer() - adds an element to the queue
5. poll() - removes an element from the queue
6. peek() - returns the element at the head of the queue
7. size() - returns the size of the queue
8. isEmpty() - returns true if the queue is empty


*/