package com.keyin;

public class StackArrays {
    int [] arr;
    int topOfStack;

    public StackArrays(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }


    //Check if it is empty
    public boolean isEmpty(){
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    //check if stack is full
    public boolean isFull(){
        if (topOfStack == arr.length -1) {
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    //implement a push method
    public void push(int value){
        if (isFull()){
            System.out.println("The stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack ++;
            System.out.println("The value is successfully inserted");
        }
    }

    //implement a pop method
    public int pop(){
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int topValue = arr[topOfStack];
            topOfStack--;
            System.out.println("The value is successfully removed");
            return topValue;
        }
    }

    //implement a peek method
    public void peek(int index){
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("The value at index " + index + " is " + arr[index]);
        }
    }

    //implement a delete method
    public void deleteStack(){
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i < arr.length; i++){
                arr[i] = 0;
            }
            topOfStack = -1;
            System.out.println("Stack has been deleted");
        }
    }

    //implement method to check if a String is a palindrome
    public static boolean isPalindrome(String word) {
        int size = word.length();
        StackArrays stack = new StackArrays(size);
        // Push all characters onto the stack as ASCII characters
        for (int i = 0; i < size; i++) {
            char character = word.charAt(i);
            int asciiValue = (int) character;
            stack.push(asciiValue);
        }
        // Form the reversed word by popping characters from the stack
        String reversedWord = "";
        while (!stack.isEmpty()) {
            reversedWord += (char) stack.pop();
        }
        // Compare the original word with the reversed word
        return word.equals(reversedWord);
    }




    // implement a stack data structure using a Linkedlist instead of arrays (can use underlying Linkedlist that comes with java)
}
