package com.joshmahony.tenpointone;

public class Queue {

    int[] queue;
    int head;
    int tail;

    public Queue(int size) {
        queue = new int[size];
        head = 0;
        tail = 0;
    }

    public void enqueue(int e) {
        queue[tail] = e;
        if(head == tail + 1 || (head == 0 && tail == queue.length)) {
            throw new RuntimeException("Overflow, queue is full");
        } else if (tail == queue.length - 1 && head != 0) {
            tail = 0;
        } else {
            tail = tail + 1;
        }
    }

    public int dequeue() {
        int x = queue[head];
        if (head == tail) {
            throw new RuntimeException("Underflow, queue is empty");
        } else if (head == queue.length - 1) {
            head = 0;
            tail = 0;
        } else {
            head = head + 1;
        }
        return x;
    }

}
