package org.gschoudhary.collections.queue;

import java.util.*;

public class QueueService {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<3;i++){
            pq.add(i);
            pq.add(1);
        }
        System.out.println(pq);
//        We will not get sorted elements by printing PriorityQueue.
        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        while (!pq.isEmpty()){
            System.out.print(pq.poll());
        }

/*
An ArrayDeque (also known as an “Array Double Ended Queue”, pronounced as “ArrayDeck”) is a special kind of a growable array that
allows us to add or remove an element from both sides.

An ArrayDeque implementation can be used as a Stack (Last-In-First-Out) or a Queue(First-In-First-Out).
 */
        Deque<Integer> integers = new ArrayDeque<>();
        integers.add(12);
    }
}
