package com.keyin;
import java.util.LinkedList;

public class StackLinkedList {

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element of the stack: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Top element after pops: " + stack.peek());

        stack.deleteStack();
    }


    private LinkedList<Integer> list;

    public StackLinkedList() {
        this.list = new LinkedList<>();
    }

    // implement a method to check is list is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // implement a method to push onto the stack
    public void push(int value) {
        list.addFirst(value); // Add to the head of the linked list
        System.out.println("Pushed onto stack: " + value);
    }

    // implement a method to pop from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Return an invalid value indicating stack is empty
        } else {
            return list.removeFirst(); // Remove from the head of the linked list
        }
    }

    // implement a method to peek at the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Return an invalid value indicating stack is empty
        } else {
            return list.getFirst(); // Get the element at the head of the linked list
        }
    }

    // implement a method to delete entire stack
    public void deleteStack() {
        list.clear();
        System.out.println("Stack has been deleted");
    }

}
