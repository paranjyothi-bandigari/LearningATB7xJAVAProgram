package ex_24082024;

import java.util.PriorityQueue;

public class Lab225 {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();

        pq.offer(1); // offer == add
        pq.offer(2);
        pq.offer(3);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
