package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

    public static void main(String[] args) {


        PriorityQueue<String> pq1 = new PriorityQueue<>();

        //pq1.add(null); Queue doesn't take null values, but list does. Duplicate values are allowed in queue.
        pq1.add("Nik");
        pq1.add("Mathew");
        pq1.add("Lisa");

        System.out.println(pq1);
        System.out.println("First Element "+pq1.peek());
        System.out.println("First Element "+pq1.poll());
        System.out.println(pq1);

        ArrayDeque<String> dq1 = new ArrayDeque<String>();

        dq1.add("Nik");
        dq1.add("Mathew");
        dq1.add("Lisa");

        System.out.println(dq1);

        System.out.println(dq1.peek());
        System.out.println(dq1.peekFirst());
        System.out.println(dq1.peekLast());

        System.out.println(dq1.poll());
        //System.out.println(dq1.pollFirst());
        //System.out.println(dq1.pollLast());

        System.out.println(dq1);
    }
}
