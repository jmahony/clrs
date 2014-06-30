package com.joshmahony.tenpointone;

public class Stack {

    int[] stack;
    int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public boolean empty() {
        return top == -1;
    }

    public  void push(int e) {
        top = top + 1;
        stack[top] = e;
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("The stack is empty");
        } else {
            top = top - 1;
            return stack[top + 1];
        }
    }

}
